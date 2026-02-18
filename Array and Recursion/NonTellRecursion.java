class NonTellRecursion {
   
        void fun(int num){

            if(num==0){
                return;
            }

            fun(--num);

            System.out.println(num);


        }

        public static void main(String[] args){
            NonTellRecursion obj=new NonTellRecursion();
            System.out.println("Start Main");
            obj.fun(5);
            System.out.println("End Main");
        }
    }

