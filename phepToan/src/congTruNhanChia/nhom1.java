package congTruNhanChia;


public class nhom1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
		
	//Phép tính cộng
	int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
                        
        int nhan = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + nhan);
	
	//Phép tính trừ
	int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);

        //Phép tính chia
	float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân
       
    }

}
