package com.constructor;

class Swap {
     int x;
     int y;
     int temp;

     public Swap() {
     }

     public Swap(int num1, int num2) {
         this.x = num1;
         this.y = num2;

         temp = x;
         x = y;
         y = temp;

         System.out.println(x + " " + y);
     }

    public Swap(Swap obj){
         this.x = obj.x;
         this.y = obj.y;

         temp = x;
         x = y;
         y =temp;
        System.out.println(x + " " + y);
    }

     public static void main(String[] args) {
         Swap obj = new Swap(10, 20);
         Swap obj2 = new Swap(obj);

     }
 }


