package com.fairly;

/**
 * Author:gagayu
 * Created:2019/3/15
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Test0315 {
    public int JumpFloorII(int target) {
        if(target<1){
            return -1;
        }

        int c=1;
        for(int i=0;i<target;i++){
            c=(int)Math.pow(2,i);
        }
        return c;
    }
}
