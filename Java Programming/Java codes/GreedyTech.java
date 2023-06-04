import java.util.*;

public class  GreedyTech {

    public static class Job{
        int id;
        int  deadline;
        int profit;

        public Job(int i, int d , int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static int buses(int mat[][]) {
        Arrays.sort(mat, Comparator.comparingDouble(o -> o[1]));

        int count = 0;
        for(int i=0; i<mat.length-1; i++) {
            if(mat[i][1]>=mat[i+1][0]) {
                mat[i+1][0]=mat[i][0];
                count++;
            }
        }
        return mat.length-count;
    }
    public static void main(String args[]){


// *****************Activity Selection ***************************        
        int start[] = {10,34,56,100,105,115};
        int end[] = {17,42,65,101,110,119};


        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        // ans.add(0);
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if(activities[i][1] >= lastEnd){
                lastEnd = activities[i][2];
                maxAct++;
                ans.add(activities[i][0]);
            }
        }

        System.out.println(maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A"+ans.get(i));
        }

//****************************Knapsack Problem **************** */
    // int val[] = {60,100,120};
    // int weight[] = {10,20,30};
    // int W = 50;

    // double ratio[][] = new double[val.length][2];
    
    // for (int i = 0; i < val.length; i++) {
    //     ratio[i][0] = i;
    //     ratio[i][1] = val[i]/(double)weight[i];
    // }

    // Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

    // int capacity = W;
    // int finalval = 0;

    // for (int i = ratio.length - 1; i>=0; i--) {
    //     int idx = (int)ratio[i][0];
    //     if(capacity >= weight[idx]){
    //         finalval += val[idx];
    //         capacity -= weight[idx];
    //     }else{
    //         finalval += (ratio[i][1] * capacity);
    //         capacity = 0;
    //         break;
    //     }
    // }

    // System.out.println(finalval);
    // }


//*********************************Minimum Absolute Difference******************* */

// int a[] = {1,4,7,8};
// int b[] = {2,3,5,6};

// Arrays.sort(a);
// Arrays.sort(b);

// int sumOfAbsoluteDifference = 0;
// for (int i = 0; i < b.length; i++) {
//     sumOfAbsoluteDifference += Math.abs(a[i] - b[i]);
// }

// System.out.println(sumOfAbsoluteDifference);


//***********Max length chain of pair. ***************/

// int pairs[][] = {{5,24} , {39,60}, {5,28},{27,40},{50,90}};

// Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

// int chainLength = 1;
// int pairEnd = pairs[0][1];

// for (int i = 1; i < pairs.length; i++) {
//     if (pairs[i][0] > pairEnd) {
//         chainLength++;
//         pairEnd = pairs[i][1];
//     }
// }

// System.out.println(chainLength);


//********************************iNDIANS cOINS **********888*/
// Integer coins[] = {1,2,5,10,20,50,100,500,2000};

// Arrays.sort(coins,Comparator.reverseOrder());

// int count = 0;
// int amount = 590; 

// ArrayList<Integer> ans = new ArrayList<>();
// for (int i = 0; i < coins.length; i++) {
//     if (coins[i] <= amount) {
//         while (coins[i] <= amount) {
//             amount = amount - coins[i];
//             count++;
//             ans.add(coins[i]);
//         }
//     }
// }

// System.out.println(count);

// for (int i = 0; i < ans.size(); i++) {
//     System.out.println(ans.get(i));
// }


//***********************Job Sequencing Problem *********************//

// int jobInfo[][] = {{4, 20}, {1,10}, {1,40}, {1,30}};

// ArrayList<Job> jobs = new ArrayList<>();

// for (int i = 0; i < jobInfo.length; i++) {

//     jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
    
// }

// Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);
// //decending order

// ArrayList<Integer> seq = new ArrayList<>();

// int time = 0;

// for (int i = 0; i < jobs.size(); i++) {
//     Job curr = jobs.get(i);
//     if(curr.deadline > time){
//         seq.add(curr.id);
//         time++;
//     }
// }

// System.out.println(time);
// for (int i = 0; i < seq.size(); i++) {
//     System.out.print(seq.get(i)+ " ");
// }

// System.out.println();

// ***************************cHOCOLA PROBLEM************************8
// int n = 4; int m = 6;
// Integer costVer[] = {2,1,3,1,4};
// Integer costHor[] = {4,1,2};

// Arrays.sort(costVer, Collections.reverseOrder());
// Arrays.sort(costHor, Collections.reverseOrder());

// int h =0, v = 0;
// int hp = 1, vp = 1;
// int cost = 0;

// while (h < costHor.length && v < costVer.length) {
//     // vertical cost < hor cost
//     if(costVer[v] <= costHor[h]){
//         cost += (costHor[h] * vp);
//         hp++;
//         h++;
//     }else{
//         cost += (costVer[v] * hp);
//         vp++;
//         v++;
//     }
    
// }

// while (h < costHor.length) {
//     cost += (costHor[h] * vp);
//     hp++;
//     h++;
// }

// while (v < costVer.length) {
//     cost += (costVer[v] * hp);
//     vp++;
//     v++;
// }

// System.out.println(cost);

int arr[][] = {
                {10,17},
                {34,42},
                {56,65},
                {100,101},
                {105,110},
                {115,119}
                    };


System.out.println(buses(arr));




    }
}





