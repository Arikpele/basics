public class Main {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();

    }

    //    public static void task1() {
//        System.out.println("задача 1");
//        String phone= "9+11-283 55-22";
//        phone = phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length()==10) {
////            phone = "7"+phone;
//        } else if (phone.length()>11) {
//         throw new RuntimeException("телефон слишком длинный");
//        } else if (phone.length()<10) {
//            throw new RuntimeException("телефон слишком короткий");
//
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("среди нас посторонний");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79112835522";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("успех");
//        } else {
//            System.out.println("неудача");
    public static void task1() {
        System.out.println("задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника-" + fullName);
    }

    public static void task2() {
        System.out.println("задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }


}
