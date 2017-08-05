package pg_ex01_2;

public class Main {

	public static void main(String[] args) {

		//変換メソッド実行
		 Romanumber();
	}//main

	//アラビア数字からローマ数字変換メソッド
	public static void Romanumber() {

		//画面から数字入力受付
		System.out.println("1～20の半角英数字を入力し、Enterを押してください▼");

		int input = new java.util.Scanner (System.in).nextInt();

		//1～20の半角英数字以外で変換不可メッセージ出力
		if(input < 1 || input > 20){
			System.out.print("変換できません");
		}else{

		//20の半角英数字変換
			if(input==20){
				System.out.print("XX");
			}else{
				//10～19の半角英数字に「X」出力
				if(input >=10){
					System.out.print("X");
					int calc10to20 =input-10;
					int calc15to19 =calc10to20-5;
					//19の半角英数字変換
					if(calc10to20 ==9){
						System.out.print("ⅠX");
					//15～18の半角英数字に「V」出力
					}else if(9 > calc10to20 && calc10to20 >=5 ){
							System.out.print("V");
							if(calc10to20 !=5){
								//10～14の半角英数字に「I」出力
								for(int i=0; i< calc15to19; i++){
									System.out.print("Ⅰ");
								//14の半角英数字に「ⅠV」出力
								}if(calc15to19==4){
									System.out.print("ⅠV");
								}
							}
					}else if(calc10to20==4){
						System.out.print("ⅠV");
					}else{
						//10～13の半角英数字に「I」出力
							for(int i=0; i< calc10to20; i++){
								System.out.print("Ⅰ");
							}
						}
				}else{
					int calc5to9 =input-5;
					//9の半角英数字に「X」出力
					if(input == 9){
						System.out.print("ⅠX");
					//5～8の半角英数字に「V」出力
					}else if(9 > input && input >=5){
							System.out.print("V");
							if(calc5to9 !=5){
								//5～8の半角英数字に「I」出力
								for(int i=0; i< calc5to9; i++){
									System.out.print("Ⅰ");
								}
							}
					//4の半角英数字に「ⅠV」出力
					}else if(input==4){
						System.out.print("ⅠV");
					}else{
						//1～3の半角英数字に「I」出力
						for(int i=0; i< input; i++){
								System.out.print("Ⅰ");
						}
					}
				}//～10と11～
			}//20
		}//1～20
	}//Romanumber()
}//class
