package sample.application.memopad;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

// コンストラクター
public class MemoDBHelper extends SQLiteOpenHelper {	// extends は「継承」の意味。

	// クラス変数
	public static String name = "memos.db";
	public static CursorFactory factory = null;
	public static Integer version = 1;
	
	public MemoDBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public MemoDBHelper(Context context) {
		super(context, name, factory, version);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void onCreate(SQLiteDatabase db) { // onCreateは「インスタンスメソッド（戻り値なし）」である。開始という意味があるのではない。
		String sql="CREATE TABLE memoDB (" // sqlは「ローカル変数」
				+android.provider.BaseColumns._ID
				+" INTEGER PRIMARY KEY AUTOINCREMENT, title Text, memo TEXT);";
		db.execSQL(sql); // インスタンスメソッド「エグゼクティブクラスSQL」
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
