class TellRecursion {
   
        void fun(int num){

            if(num==0){
                return;
            }

            System.out.println(num);

            fun(--num);


        }

        public static void main(String[] args){
            TellRecursion obj=new TellRecursion();
            System.out.println("Start Main");
            obj.fun(5);
            System.out.println("End Main");

        }
    }
