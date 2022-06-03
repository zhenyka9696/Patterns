package com.company;

public class Mariam {
    public static void main(String[] args) throws CloneNotSupportedException {
        Girl mariam=new Girl("Mariam",true,true,true);
        System.out.println(mariam);
        Girl notMariam= (Girl) mariam.clone();
        notMariam.setName("notMariam");
        notMariam.setSilly(false);
        notMariam.setLazy(false);
        System.out.println(notMariam);
    }
    }
     class Girl implements Cloneable {
        private String name;
        private boolean silly;
        private boolean little;
        private boolean lazy;

        public Girl(String name, boolean silly, boolean little, boolean lazy) {
            this.name = name;
            this.silly = silly;
            this.little = little;
            this.lazy = lazy;
        }

        public String getName() {
            return name;
        }

        public boolean isSilly() {
            return silly;
        }

        public boolean isLittle() {
            return little;
        }

        public boolean isLazy() {
            return lazy;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

         @Override
         public String toString() {
             return "Girl{" +
                     "name='" + name + '\'' +
                     ", silly=" + silly +
                     ", little=" + little +
                     ", lazy=" + lazy +
                     '}';
         }

         public void setName(String name) {
             this.name = name;
         }

         public void setSilly(boolean silly) {
             this.silly = silly;
         }

         public void setLittle(boolean little) {
             this.little = little;
         }

         public void setLazy(boolean lazy) {
             this.lazy = lazy;
         }
     }



