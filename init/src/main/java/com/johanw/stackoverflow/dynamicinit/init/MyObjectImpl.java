    package com.johanw.stackoverflow.dynamicinit.init;

    public class MyObjectImpl {
        private String name;
        private String street;
        private int number;

        public MyObjectImpl() {
        }

        public MyObjectImpl(String name, String street, int number) {
            this.name = name;
            this.street = street;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
        public void setNumberAsString(String number) {
            this.number = Integer.valueOf(number);
        }

        @Override
        public String toString() {
            return "MyObjectImpl{" +
                    "name='" + name + '\'' +
                    ", street='" + street + '\'' +
                    ", number=" + number +
                    '}';
        }
    }
