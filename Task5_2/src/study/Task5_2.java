package study;
/**
* Task5-2: 課題内容
*
* 本課題では、2-6で学習した基本的なデータ型の使い方と演算を学びます。
* ユーザーの名前や年齢、メールアドレスなどを一時的に変更するプログラムを作成して下さい。
* この課題では、変数の定義、上書き、出力、命名規則（キャメルケース）に注目して学びます。
*
* 各問で指定された型・初期値を守って実装して下さい。
* 変数名の命名にはキャメルケースを使い、「何の情報か」がわかりやすい変数名を自分で考えて記述してください。
*
*/
public class Task5_2 {
	public static void main(String[] args) {


		// ①String型のユーザーの名前を格納する変数を定義し、「田中太郎」で初期化して下さい。※変数名はご自身で命名して下さい。
		String userName = "田中太郎";
				
		// ②int型の年齢を格納する変数を定義し、25で初期化して下さい。※変数名はご自身で命名して下さい。
		int age = 25;
		
		// ③String型の電話番号を格納する変数を定義し、「090-1234-5678」で初期化して下さい。※変数名はご自身で命名して下さい。
		String telNumber = "090-1234-5678";
		
		// ④String型のメールアドレスを格納する変数を定義し、「taro@example.com」で初期化して下さい。※変数名はご自身で命名して下さい。
		String userEmail = "taro@example.com";
		
		// ⑤String型のパスワードを格納する変数を定義し、「pass1234」で初期化して下さい。※変数名はご自身で命名して下さい。
		String passWord = "pass1234";
		
		// ④ユーザーの名前を「田中次郎」に上書きして下さい。
		userName = "田中次郎";
		
		// ⑥年齢を「30」に上書きして下さい。
		age = 30;
				
		// ⑦電話番号を「080-9876-5432」に上書きして下さい。
		telNumber = "080-9876-5432";
				
		// ⑧年齢を1歳加算して下さい。
		age = age + 1;
				
		// ⑨userEmail を再度「jiro.tanaka@example.com」に上書きして下さい。
		userEmail = "jiro.tanaka@example.com";
				
		// ⑩各変数の値を表示
		System.out.println("名前：" + userName);
		System.out.println("年齢：" + age + "歳");
		System.out.println("電話：" + telNumber);
		System.out.println("メール：" + userEmail);
		System.out.println("パスワード：" + passWord);
			}
		}
