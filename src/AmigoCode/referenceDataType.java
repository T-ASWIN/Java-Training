package AmigoCode;


    class Car {
        String model;
    }

    public class referenceDataType {
        public static void changeModel(Car car) {
            car.model = "Tesla";  // Modifies the object referenced by car
        }

        public static void reassignReference(Car car) {
            car = new Car();       // Reassigns the reference to a new object
            car.model = "Ford";    // This change won't affect the original reference
        }

        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.model = "Toyota";

            changeModel(myCar);
            System.out.println("After changeModel: " + myCar.model);  // Output: Tesla

            reassignReference(myCar);
            System.out.println("After reassignReference: " + myCar.model);  // Output: Tesla
        }
    }

