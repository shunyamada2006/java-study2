package section_15;

public class Product {
    //フィールド
    private String name = "";
    private int price = 0;
    private int stock = 0;

    //コンストラクタ
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        System.out.println("「商品データを生成」" + this.name);
        System.out.println("価格" + price + "円(税込み)/在庫数:" + stock);
    }

    //メソッド
    public void takeOrder(final int number) {//number=注文数
        System.out.println("【注文処理開始】");
        System.out.println("商品名" + this.name);
        System.out.println("商品価格" + this.price + "円(税込み)");
        System.out.println("注文数" + number + "/在庫数：" + this.stock);

        if (this.stock < number) {
            System.out.println(this.name + "は在庫不足です");
            return;//購入できないから終わる
        }
        int total = this.price * number;
        System.out.println(number + "点で合計" + total + "円です");

        this.stock -= number;
        System.out.println(this.name + "の残りの在庫は" + this.stock);


    }
}
