public class MyData {
    static String color = "none";
    static Boolean isColorSet = false;
    static Boolean isGenderSet = false;
    static String gender = "";
    static Boolean isWashHairSet = false;
    static Boolean isHairCutSet = false;
    static String message = "";
    static String display = "";

    static String reciept = "";

    static double quantity_one = 0;
    static double quantity_two = 0;
    static double quantity_three = 0;

    static double hairPrice = 0;
    static double wash_cut = 0;

    static double productPrice_one = 0;
    static double productPrice_two = 0;
    static double productPrice_three = 0;


    public static String displayOutput (){
            return MyData.message +'\n'+ MyData.display +'\n' + "Dyed "+ MyData.color + "\n";
    }

    public static String displayReciept () {
        int one = (int)MyData.quantity_one;
        int two = (int)MyData.quantity_two;
        int three = (int)MyData.quantity_three;

        double totalPrice = MyData.wash_cut + MyData.hairPrice + MyData.productPrice_one + MyData.productPrice_two + MyData.productPrice_three;

        return MyData.message + "\n" +
                MyData.display + " = RM" + MyData.wash_cut + "0" + "\n" +
                "Dyed "+ MyData.color + " = RM" + MyData.hairPrice + "0" + "\n\n" +
                "Products : " + "\n" + "          " +
                "Redken Hair Mouisturizer" + " x " + one + " = RM" + MyData.productPrice_one + "0" + "\n" + "          " +
                "Loreal Hair Louchup" + " x " + two + " = RM" + MyData.productPrice_two + "0" + "\n" + "          " +
                "Ginseng Shampoo Anti Hair Fall" + " x " + three + " = RM" + MyData.productPrice_three + "0" + "\n" + "          " + "\n\n\n" +
                "Total = RM" + totalPrice;
    }
    public static void clearData(){
        color = "none";
        isColorSet = false;
        isGenderSet = false;
        isWashHairSet = false;
        isHairCutSet = false;
        gender = "";
        message = "";
        display = "";
    }


}


