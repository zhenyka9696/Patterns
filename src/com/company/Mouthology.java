package com.company;

public class Mouthology {
    public static void main(String[] args) {
        Person professor=Person.getBuilder()
                .setProfession("scientist")
                .setBiology(true)
                .setBiology(true)
                .setEcology(true)
                .setGeography(true)
                .setEscopology(false)
                .setMothology(true)
                .getPerson();
        System.out.println(professor);
        Person sailor=Person.getBuilder()
                .setProfession("sailor")
                .setEscopology(true)
                .setSwiminology(true)
                .getPerson();
        System.out.println(sailor);
    }
}
//Inner builder
class Person {
    private String profession = " ";

    public String getProfession() {
        return profession;
    }

    public boolean isBiology() {
        return biology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscopology() {
        return escopology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    public static Builder getBuilder(){
        return new Person().new Builder();
    }

    private boolean biology;
    private boolean geography;
    private boolean ecology;
    private boolean swiminology;
    private boolean escopology;
    private boolean mouthology;

    @Override
    public String toString() {
        return "Person{" +
                "profession='" + profession + '\'' +
                ", biology=" + biology +
                ", geography=" + geography +
                ", ecology=" + ecology +
                ", swiminology=" + swiminology +
                ", escopology=" + escopology +
                ", mouthology=" + mouthology +
                '}';
    }


    public class Builder {
        public Builder setProfession(String profession) {
            Person.this.profession = profession;
            return this;
        }

        public Builder setBiology(boolean biology) {
            Person.this.biology = biology;
            return this;
        }

        public Builder setGeography(boolean geography) {
            Person.this.geography = geography;
            return this;
        }

        public Builder setEcology(boolean ecology) {
            Person.this.ecology = ecology;
            return this;
        }

        public Builder setSwiminology(boolean swiminology) {
            Person.this.swiminology = swiminology;
            return this;
        }

        public Builder setEscopology(boolean escopology) {
            Person.this.escopology = escopology;
            return this;
        }

        public Builder setMothology(boolean mothology) {
            Person.this.mouthology = mothology;
            return this;
        }
        public Person getPerson(){
            return  Person.this;
        }
    }
}