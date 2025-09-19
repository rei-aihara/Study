package study;


public class Task5_3 {


	// 定数（メッセージ）
	private static final String MSG_SCORE_HIGH = "スコアが90点以上：とてもよくできました";
	private static final String MSG_SCORE_MIDDLE = "スコアが60点以上：よくできました";
	private static final String MSG_SCORE_LOW = "スコアが60点未満：再テストです";


	private static final String MSG_ADULT_MALE = "成人男性です";
	private static final String MSG_ADULT_FEMALE = "成人女性です";
	private static final String MSG_UNDERAGE = "未成年です";




	public static void main(String[] args) {


		/** --------------------------------------------------------------------------------------------------------------------------
		 *  問① 【変数を使って文章を組み立てましょう】
		 *  ・文字列型の変数を使って文章を組み立てる方法を学ぶ。
		 *  ・文字列の連結（結合）操作を理解する。
		 */


		String station = "東京駅";
		String lineName = "山手線";
		String action = "乗ります";


		// 問① 変数を使って「私は東京駅から山手線に乗ります。」と出力して下さい。
		System.out.println("私は" + station + "から" + lineName + "に" + action + "。");



		/**  --------------------------------------------------------------------------------------------------------------------------
		 * 問②～⑤【商品価格に対して、消費税を加えて税込価格を求めるプログラムを実装します】
		 *  ・小数点を扱う方法を理解する。
		 *  ・変数を使って計算結果を保持する方法を学ぶ。
		 */
		// 問② 商品価格「9980」を変数priceで、消費税10%「0.10」を変数taxで初期化して下さい。※小数点を扱うのでデータ型に注意してください。
		int price = 9980;
		double tax = 0.10;


		// 問③ 税額を計算した値を代入する、変数taxAmountと税込み価格を計算した値を代入する、変数totalPriceを作成して下さい。
		double taxAmount = price * tax;
		double totalPrice = price + taxAmount;


		// 問⑤税額と税込み価格を出力して下さい。
		System.out.println("税額：" + taxAmount + "円");
		System.out.println("税込価格：" + totalPrice + "円");


		/**  --------------------------------------------------------------------------------------------------------------------------
		 * 問⑥【プログラムを理解しましょう。】
		 */
		// 問⑥ 下記の処理について、何をしているかコメントを記入して下さい。
		// [商品名「ノートパソコン」を変数itemName、注文数「３」を変数quantity、単価「85000」を変数unitPriceで初期化し表示、合計金額を代入する変数totalを作成し、表示]


		String itemName = "ノートパソコン";
		int quantity = 3;
		int unitPrice = 85000;
		int total = quantity * unitPrice;


		String message = "商品名: " + itemName +
				", 注文数: " + String.valueOf(quantity) +
				", 単価: " + String.valueOf(unitPrice) + "円" +
				", 合計: " + String.valueOf(total) + "円";


		System.out.println(message);




		/** --------------------------------------------------------------------------------------------------------------------------
		 *  問⑦【スコアの点数に応じて条件分岐でメッセージを表示するプログラムを実装します】
		 *  ・if-else文を使った条件分岐の基礎を学ぶ。
		 *  ・定数を活用した可読性の高いコードを書く方法を理解する。
		 */


		// 問⑦ 変数scoreの値に応じて以下のメッセージを出力するプログラムを作成して下さい。※条件分岐(if-else)と定数を組み合わせて使うこと
		// ・スコアが90以上の場合は、定数を使用して「スコアが90点以上：とてもよくできました」と出力して下さい。
		// ・スコアが60以上の場合は、定数を使用して「スコアが60点以上：よくできました」と出力して下さい。
		// ・それ以外の場合は、定数を使用し「スコアが60点未満：再テストです」と出力して下さい。


		int score = 88;
		
		if (score >= 90){
			System.out.println(MSG_SCORE_HIGH);
		} else if (score >= 60) {
			System.out.println(MSG_SCORE_MIDDLE);
		} else {
			System.out.println(MSG_SCORE_LOW);
		}



		/** --------------------------------------------------------------------------------------------------------------------------
		 *  問⑧【年齢と性別に応じて条件分岐し、適切なメッセージを表示するプログラムを実装します】
		 *  ・複数条件を組み合わせる方法を理解する。
		 *  ・文字列比較の使い方を習得する。
		 */


		// 問⑧ 変数ageとgenderの値に応じて、以下のメッセージを出力するプログラムを作成して下さい。
		// ・年齢が20歳以上で性別が「男性」の場合は、「成人男性です」と出力して下さい。
		// ・年齢が20歳以上で性別が「女性」の場合は、「成人女性です」と出力して下さい。
		// ・それ以外の場合は、「未成年です」と出力して下さい。
		int age = 25;
		String gender = "女性";
		
		if (age >= 20 && gender.equals("男性")) {
			System.out.println(MSG_ADULT_MALE);
		} else if (age >= 20 && gender.equals("女性")){
			System.out.println(MSG_ADULT_FEMALE);
		} else {
			System.out.println(MSG_UNDERAGE);
		}


	}
}
