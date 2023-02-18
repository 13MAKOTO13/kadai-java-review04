package animal;

public class Human extends Animal implements Thinkable {
	private String hobby;

	// コンストラクタ
	public Human() {
	}

	// 引数ありコンストラクタ
	public Human(String hobby) {
	    this.hobby = hobby;
	    }

	//getter&setterの作成
	public String getHobby() {
	    return hobby;
	}

	public void setHobby(String hobby) {
	    this.hobby = hobby;
	}

	//私の()について。メソッド
	public void think() {
	    System.out.println("私は" + hobby + "について考えています。");
	}
	}

