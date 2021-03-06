
import java.util.Scanner;
import java.util.Calendar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



class SalesManagement //extends Cash
{
	String select;							// 餌辨濠煎睡攪 殮溘嫡擎 詭景 摹鷗
	Calendar now = Calendar.getInstance();

	// 衙轎⑷�� �挫� or 衛營 �挫�, 殮溘 詭景 摹鷗
	public void showChoice() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		// 詭景 摹鷗
		try
		{
			System.out.println();
			System.out.println();
			System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
			System.out.println();
			System.out.println("\t\t1. 衙轎 ⑷�� �挫�");
			System.out.println("\t\t2. 衛營 �挫� 塽 殮溘");
			System.out.println();
			System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
			System.out.print("\t    錳ж衛朝 詭景蒂 摹鷗п輿撮蹂 : ");
			select = sc.next();

			if (!select.equals("1") && !select.equals("2"))
				throw new choiceException(select);
		}//try僥 殘晦
		catch (choiceException e)
		{
			e.showWrongChoice();
			System.out.println("\t摹鷗擊 籀擠睡攪 棻衛 霞чм棲棻.");
			this.choiceMenu();
		}//catch 僥 殘晦

		switch (select)
		{
			case "1": this.choiceMenu(); break;
			case "2": this.choiceMoney(); break;
		}
		
	}//showChoice 部
	

	// 衙轎⑷�� 薑溺 寞衝 摹鷗 詭景
	public void choiceMenu() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		Management mg = new Management();

		// 詭景 摹鷗
		try
		{
			System.out.println();
			System.out.println();
			System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
			System.out.println();
			System.out.println("\t\t1. 橾濠滌 衙轎⑷��");
			System.out.println("\t\t2. 詭景滌 衙轎⑷��");
			System.out.println("\t\t3. �蛾羉� 唸薯頂羲");
			System.out.println("\t\t4. 唸薯熱欽滌 衙轎⑷��");
			System.out.println("\t\t5. 跡ル衙轎擋婁 殖撩睦");
			System.out.println("\t\t6. 婦葬濠 詭檣 �飛橉虞� 給嬴陛晦");
			System.out.println();
			System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
			System.out.print("\t    錳ж衛朝 詭景蒂 摹鷗п輿撮蹂 : ");
			select = sc.next();

			if (!select.equals("1") && !select.equals("2") && !select.equals("3") && !select.equals("4") && !select.equals("5") && !select.equals("6"))
				throw new choiceException(select);
		}//try僥 殘晦
		catch (choiceException e)
		{
			e.showWrongChoice();
			System.out.println("\t摹鷗擊 籀擠睡攪 棻衛 霞чм棲棻.");
			this.choiceMenu();
		}//catch 僥 殘晦

		switch (select)
		{
			case "1": this.dateArray(); break;
			case "2": this.menuArray(); break;
			case "3": this.memberArray(); break;
			case "4": this.cardCashArray(); break;
			case "5": this.goalArray(); break;
			case "6": mg.managerMenu(); break;
		}
	} //choiceMenu 部

	// ArrData⑽擊 陛雖朝 ArrayList 濠猿掘褻蒂 餌辨п憮
	// 衙轎⑷�� 轎溘 衛 в蹂и 等檜攪菟擊 и廓縑 氬堅, 錳ж朝 寞衝渠煎 薑溺п憮 轎溘ж晦 嬪и 贗楚蝶
	//⊥ 橾濠滌 / 詭景滌 / �蛾羉� / 唸薯熱欽滌煎 <贗楚蝶>蒂 釭散, 薑溺 晦遽擊 棻腦啪 螃幗塭檜註л

	// 橾濠滌 衙轎⑷��
	public void dateArray() throws IOException
	{
		List<ArrData> list = new ArrayList<ArrData>();
		DateArray dateArray = new DateArray();
		int arrTotal=0;	
		String insertDate;

		Scanner sc = new Scanner(System.in);


		// 薑溺 轎溘 衛 �挫恉炱� 嬪и 歜曖 等檜攪 蹺陛
		list.add(new ArrData(2021, 3, 15, 10, 10, "瞪��葡", "嫦溶衛嬴", 1, 20000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 12, 10, "瞪��葡", "綰瑞 ж諦檜", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 20, 30, "瞪��葡", "葆陛葬顫", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 22, 22, "瞪��葡", "霞 塭歜", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 11, 15, "梯陛艙", "等鑒塭 餌錶", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 10, 22, "梯陛艙", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 18, 39, "梯陛艙", "摹 廓", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 40, "梯陛艙", "ъ棲僥", 1, 20000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 15, 21, "薑輿��", "贗煎幗 贗毀", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 17, 10, "薑輿��", "Я傍 屬塭棻", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 51, "薑輿��", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 23, 50, "薑輿��", "觼楚醴", 4, 12000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 12, 20, "寰薑嘐", "嬴跨萄", 5, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 14, 28, "寰薑嘐", "綰瑞 ж諦檜", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 21, 43, "寰薑嘐", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 52, "寰薑嘐", "等鑒塭 餌錶", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 16, 25, "夢薑遽", "葆陛葬顫", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 19, 37, "夢薑遽", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 58, "夢薑遽", "綰瑞 ж諦檜", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 11, 43, "夢薑遽", "觼楚醴", 5, 15000, "⑷旎"));


		// Щ煎斜極 褒ч 衛 殮溘腎朝 高菟 翱翕п憮 и 廓縑 蹺陛
		//list.add(new ArrData());
		
		Collections.sort(list, dateArray);

		System.out.println();
		System.out.println();
		//System.out.print("\t橫雯 陳瞼曖 唸薯 頂羲擊 轎溘й梱蹂? (璋濠 8濠葬煎 殮溘ж撮蹂: ex. 20190527) : ");
		//insertDate = sc.next();	// 20210317

		/*
		insertDate.substring(0,4)
		
		if (list.)
		{
		}
		*/

		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 [ 橾濠滌 衙轎⑷�� ] 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t  No   \t\t唸薯衛陝\t\t  唸薯詭景\t掘衙濠\t 熱榆\t唸薯旎擋\t唸薯熱欽");
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		ListIterator it = list.listIterator();
		int num=0;
		while (it.hasNext())
		{
			num++;
			ArrData obj = (ArrData)it.next();
			System.out.printf("\t  %2d   %4d喇 %2d錯 %2d橾 %2d衛 %2d碟\t%6s\t%s\t%2d偃\t%,d\t\t%s\n",
			num, obj.getY(), obj.getM(), obj.getD(), 
			obj.getH(), obj.getMin(), obj.menu, obj.name, obj.count, obj.total, obj.strHow);
			arrTotal += obj.total;
		}
		System.out.println();	
		
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.printf("\t  識 衙轎擋: %,d錳\n", arrTotal);
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		choiceMenu();
	}		


	// 詭景滌 衙轎⑷��>>> 唸薯 詭景 晦遽 螃葷離牖 薑溺
	public void menuArray() throws IOException
	{
		List<ArrData> list = new ArrayList<ArrData>();
		int arrTotal=0;							// 薑溺 褻勒縑憮 勘楝螳 釭螃朝 識 衙轎 м
		
		// 詭景 晦遽戲煎 螃葷離牖 薑溺ж晦 嬪п 薑溺 晦遽 螃幗塭檜註и 贗楚蝶 檣蝶欐蝶 儅撩
		MenuArray menuArray = new MenuArray();

		// 薑溺 轎溘 衛 �挫恉炱� 嬪и 歜曖 等檜攪 蹺陛
		list.add(new ArrData(2021, 3, 15, 10, 10, "瞪��葡", "嫦溶衛嬴", 1, 20000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 12, 10, "瞪��葡", "綰瑞 ж諦檜", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 20, 30, "瞪��葡", "葆陛葬顫", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 22, 22, "瞪��葡", "霞 塭歜", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 11, 15, "梯陛艙", "等鑒塭 餌錶", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 10, 22, "梯陛艙", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 18, 39, "梯陛艙", "摹 廓", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 40, "梯陛艙", "ъ棲僥", 1, 20000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 15, 21, "薑輿��", "贗煎幗 贗毀", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 17, 10, "薑輿��", "Я傍 屬塭棻", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 51, "薑輿��", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 23, 50, "薑輿��", "觼楚醴", 4, 12000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 12, 20, "寰薑嘐", "嬴跨萄", 5, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 14, 28, "寰薑嘐", "綰瑞 ж諦檜", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 21, 43, "寰薑嘐", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 52, "寰薑嘐", "等鑒塭 餌錶", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 16, 25, "夢薑遽", "葆陛葬顫", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 19, 37, "夢薑遽", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 58, "夢薑遽", "綰瑞 ж諦檜", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 11, 43, "夢薑遽", "觼楚醴", 5, 15000, "⑷旎"));

		// Щ煎斜極 褒ч 衛 殮溘腎朝 高菟 翱翕п憮 и 廓縑 蹺陛
		//list.add(new ArrData());

		// 詭景晦遽 螃葷離牖 薑溺 �� 轎溘
		Collections.sort(list, menuArray);
		
		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 [ 詭景滌 衙轎⑷�� ] 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t  No   \t 唸薯詭景\t\t  唸薯衛陝\t\t掘衙濠\t 熱榆\t唸薯旎擋\t唸薯熱欽");
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		ListIterator it = list.listIterator();
		int num=0;
		while (it.hasNext())
		{
			num++;
			ArrData obj = (ArrData)it.next();
			System.out.printf("\t  %2d   %7s\t%4d喇 %2d錯 %2d橾 %2d衛 %2d碟\t%s\t%2d偃\t%,d\t\t%s\n",
			num, obj.menu, obj.getY(), obj.getM(), obj.getD(), 
			obj.getH(), obj.getMin(), obj.name, obj.count, obj.total, obj.strHow);
			arrTotal += obj.total;
		}
		System.out.println();	
		
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.printf("\t  識 衙轎擋: %,d錳\n", arrTotal);
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		choiceMenu();
	}


	// �蛾羉� 衙轎⑷�� >>>檜葷 晦遽 螃葷離牖薑溺
	public void memberArray() throws IOException
	{
		List<ArrData> list = new ArrayList<ArrData>();
		MemberArray memberArray = new MemberArray();
		int arrTotal=0;							// 薑溺 褻勒縑憮 勘楝螳 釭螃朝 識 衙轎 м

		list.add(new ArrData(2021, 3, 15, 10, 10, "瞪��葡", "嫦溶衛嬴", 1, 20000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 12, 10, "瞪��葡", "綰瑞 ж諦檜", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 20, 30, "瞪��葡", "葆陛葬顫", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 22, 22, "瞪��葡", "霞 塭歜", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 11, 15, "梯陛艙", "等鑒塭 餌錶", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 10, 22, "梯陛艙", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 18, 39, "梯陛艙", "摹 廓", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 40, "梯陛艙", "ъ棲僥", 1, 20000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 15, 21, "薑輿��", "贗煎幗 贗毀", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 17, 10, "薑輿��", "Я傍 屬塭棻", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 51, "薑輿��", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 23, 50, "薑輿��", "觼楚醴", 4, 12000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 12, 20, "寰薑嘐", "嬴跨萄", 5, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 14, 28, "寰薑嘐", "綰瑞 ж諦檜", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 21, 43, "寰薑嘐", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 52, "寰薑嘐", "等鑒塭 餌錶", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 16, 25, "夢薑遽", "葆陛葬顫", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 19, 37, "夢薑遽", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 58, "夢薑遽", "綰瑞 ж諦檜", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 11, 43, "夢薑遽", "觼楚醴", 5, 15000, "⑷旎"));

		Collections.sort(list, memberArray);

		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 [ �蛾羉� 衙轎⑷�� ] 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t  No   \t掘衙濠\t\t  唸薯衛陝\t\t唸薯詭景\t 熱榆\t唸薯旎擋\t唸薯熱欽");
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		ListIterator it = list.listIterator();
		int num=0;
		while (it.hasNext())
		{
			num++;
			ArrData obj = (ArrData)it.next();
			System.out.printf("\t  %2d   %s\t%4d喇 %2d錯 %2d橾 %2d衛 %2d碟\t%6s\t%2d偃\t%,d\t\t%s\n",
			num, obj.name, obj.getY(), obj.getM(), obj.getD(), 
			obj.getH(), obj.getMin(), obj.menu, obj.count, obj.total, obj.strHow);
			arrTotal += obj.total;
		}
		System.out.println();	
		
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.printf("\t  識 衙轎擋: %,d錳\n", arrTotal);
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
	
		choiceMenu();
	}

	// 唸薯熱欽滌 衙轎⑷�� >>>唸薯熱欽 晦遽 螃葷離牖 薑溺 or 匐儀晦棟: 蘋萄 or ⑷旎
	public void cardCashArray()  throws IOException
	{
		List<ArrData> list = new ArrayList<ArrData>();
		CardCashArray ccArray = new CardCashArray();
		int arrTotal=0;							// 薑溺 褻勒縑憮 勘楝螳 釭螃朝 識 衙轎 м

		list.add(new ArrData(2021, 3, 15, 10, 10, "瞪��葡", "嫦溶衛嬴", 1, 20000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 12, 10, "瞪��葡", "綰瑞 ж諦檜", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 20, 30, "瞪��葡", "葆陛葬顫", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 22, 22, "瞪��葡", "霞 塭歜", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 11, 15, "梯陛艙", "等鑒塭 餌錶", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 10, 22, "梯陛艙", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 18, 39, "梯陛艙", "摹 廓", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 40, "梯陛艙", "ъ棲僥", 1, 20000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 15, 21, "薑輿��", "贗煎幗 贗毀", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 17, 10, "薑輿��", "Я傍 屬塭棻", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 51, "薑輿��", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 23, 50, "薑輿��", "觼楚醴", 4, 12000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 12, 20, "寰薑嘐", "嬴跨萄", 5, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 14, 28, "寰薑嘐", "綰瑞 ж諦檜", 1, 15000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 21, 43, "寰薑嘐", "嫦溶衛嬴", 1, 20000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 20, 52, "寰薑嘐", "等鑒塭 餌錶", 1, 10000, "⑷旎"));

		list.add(new ArrData(2021, 3, 15, 16, 25, "夢薑遽", "葆陛葬顫", 1, 10000, "蘋萄"));
		list.add(new ArrData(2021, 3, 16, 19, 37, "夢薑遽", "囀蝶賅ィ葬驕", 1, 18000, "蘋萄"));
		list.add(new ArrData(2021, 3, 17, 22, 58, "夢薑遽", "綰瑞 ж諦檜", 1, 10000, "⑷旎"));
		list.add(new ArrData(2021, 3, 18, 11, 43, "夢薑遽", "觼楚醴", 5, 15000, "⑷旎"));
		
		Collections.sort(list, ccArray);

		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 [ 唸薯 熱欽滌 衙轎⑷�� ] 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t  No   \t 唸薯熱欽\t  唸薯詭景\t唸薯衛陝\t\t掘衙濠\t 熱榆\t唸薯旎擋");
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		ListIterator it = list.listIterator();
		int num=0;
		while (it.hasNext())
		{
			num++;
			ArrData obj = (ArrData)it.next();
			System.out.printf("\t  %2d   %s\t\t%6s\t%4d喇 %2d錯 %2d橾 %2d衛 %2d碟\t%s\t%2d偃\t%,d\n",
			num, obj.strHow, obj.menu, obj.getY(), obj.getM(), obj.getD(), 
			obj.getH(), obj.getMin(), obj.name, obj.count, obj.total);
			arrTotal += obj.total;
		}
		System.out.println();	
		
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.printf("\t  識 衙轎擋: %,d\n", arrTotal);
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		choiceMenu();
	}


	// 跡ル衙轎擋婁 殖撩睦
	public void goalArray() throws IOException
	{
		//int goal = (int)(arrTotal/10000);		// 殖撩睦 啗骯
		//int arrTotal=0;							// 薑溺 褻勒縑憮 勘楝螳 釭螃朝 識 衙轎 м

		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 [ 跡ル 衙轎擋婁 殖撩睦 ] 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t\t  跡ル 衙轎擋: 1,000,000錳");
		//System.out.printf("\t\t     識 衙轎擋: %,d", arrTotal);
		//System.out.println("\t\t       殖撩睦: %d", goal);
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		choiceMenu();
	}



	// 剪蝶葷絲 ⑷�� �挫�(掏謙滌) 塽 衛營 蹺陛 殮溘

	// 詭景摹鷗 1. 衛營 �挫� 2. 衛營 蹺陛 殮溘
	public void choiceMoney() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		// 詭景 摹鷗
		try
		{
			System.out.println();
			System.out.println();
			System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
			System.out.println();
			System.out.println("\t\t1. 衛營 �挫�");
			System.out.println("\t\t2. 衛營 蹺陛 殮溘");
			System.out.println();
			System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
			System.out.print("\t    錳ж衛朝 詭景蒂 摹鷗п輿撮蹂 : ");
			select = sc.next();

			if (!select.equals("1") && !select.equals("2"))
				throw new choiceException(select);
		}//try僥 殘晦
		catch (choiceException e)
		{
			e.showWrongChoice();
			System.out.println("\t摹鷗擊 籀擠睡攪 棻衛 霞чм棲棻.");
			this.choiceMenu();
		}//catch 僥 殘晦

		switch (select)
		{
			case "1": ; this.printCash(); break;
			case "2": ; this.plusCash(); break;
		}

	}//choiceMoney 部


	// 掏謙滌 ⑷旎 ⑷�� 轎溘
	public void printCash()  throws IOException
	{
		Cash c = new Cash();

		int[] cashList = {10000, 5000, 1000, 500, 100};
		int totCash = c.getManW() + c.getOchunW() + c.getChunW() + c.getObakW() + c.getBakW();		// 譆謙 м骯 旎擋

		int manCount, ochunCount, chunCount, obakCount, bakCount;		// 掏謙滌 ⑷營 熱榆

		// 掏謙滌 ⑷營 熱榆 啗骯 (旎擋/掏謙 и 跟 = 熱榆)
		manCount = c.getManW()/10000;
		ochunCount = c.getOchunW()/5000;
		chunCount = c.getChunW()/1000;
		obakCount = c.getObakW()/500;
		bakCount = c.getBakW()/100;

		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 [ 衛營 ⑷�� ] 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t\t      POS ⑷旎");
		System.out.println("\t  掏謙\t      熱榆    旎擋");

		System.out.printf("\t10,000錳\t%d\t%s\n", manCount, String.format("%,d",c.getManW()));
		System.out.printf("\t 5,000錳\t%d\t%s\n", ochunCount, String.format("%,d",c.getOchunW()));
		System.out.printf("\t 1,000錳\t%d\t%s\n", chunCount, String.format("%,d",c.getChunW()));		
		System.out.printf("\t   500錳\t%d\t%s\n", obakCount, String.format("%,d",c.getObakW()));
		System.out.printf("\t   100錳\t%d\t%s\n", bakCount, String.format("%,d",c.getBakW()));
		System.out.println();
		System.out.printf("\t    艙機 遽綠旎 : 100,000錳\n");
		System.out.printf("\t   ⑷營 識 旎擋 : %s錳\n", String.format("%,d",totCash));
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		
		choiceMenu();
	}


	// 衛營 蹺陛 殮溘

	public void plusCash() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		int beforeCash;											// 衛營 蹺陛 瞪 識 旎擋
		int afterCash;											// 衛營 蹺陛 �� 識 旎擋
		int[] cashList = {10000, 5000, 1000, 500, 100};
		int[] count = new int[5];								// 殮溘嫡朝 掏謙滌 熱榆
		int[] plusCash = new int[5];							// 掏謙滌 蹺陛 旎擋 (衛營縑 蹺陛й 旎擋)
		int totalPlus = 0;										// 識 蹺陛 殮溘 旎擋

		// ⑷營 爾嶸醞檣 ⑷旎 識旎擋
		Cash ch = new Cash();
		beforeCash = ch.getManW() + ch.getOchunW() + ch.getChunW() + ch.getObakW() + ch.getBakW();

		// 癱殮 掏謙, 熱榆 殮溘
		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.println("\t    掏謙滌 蹺陛 熱榆擊 殮溘п輿撮蹂.");
		System.out.println();

		// ⑷旎 掏謙滌煎 釭普 寡翮 轎溘ж貊 п渡 旎擋掏曖 熱榆 殮溘嫡晦 ⊥ 掏謙滌 癱殮旎擋 啗骯
		for (int i=0; i<cashList.length; i++)
		{
			System.out.printf("\t%5d錳: ", cashList[i]);
			count[i] = sc.nextInt();
			plusCash[i] += cashList[i]*count[i];
			totalPlus += plusCash[i];
		}

		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		System.out.println();
		System.out.println();

		// 殮溘嫡擎 旎擋 �挫�
		System.out.println();
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");	
		System.out.println();
		System.out.printf("\t    艙機 遽綠旎 : 100,000錳\n");
		System.out.printf("\t 蹺陛 殮溘 旎擋 : %,d錳\n" + totalPlus);
		System.out.printf("\t        識 旎擋 : %,d錳\n" + (beforeCash+totalPlus));
		System.out.println();
		System.out.println("\t式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式");
		System.out.print("\t鼻晦 唸婁渠煎 衛營蒂 殮溘ж衛啊蝗棲梱? (Y/N) : ");
		select = sc.next();

		if (select.equals("Y") || select.equals("y"))
		{

			// 殮溘嫡擎 旎擋虜躑 餌辨濠 薑曖 儅撩濠 鱔п 衛營縑 渦ж晦
			Cash c = new Cash(plusCash[0], plusCash[1], plusCash[2], plusCash[3], plusCash[4]);

			// 衛營 殮溘 �� ⑷營 識 旎擋 啗骯
			afterCash = c.getManW() + c.getOchunW() + c.getChunW() + c.getObakW() + c.getBakW();

			System.out.println();
			System.out.println();
			System.out.println("\t殮溘檜 諫猿腎歷蝗棲棻.");
			System.out.println();
			this.choiceMoney();							// 棻衛 摹鷗詭景煎 給嬴陛晦??
		}
		else
		{
			System.out.println();
			System.out.println();
			System.out.println("衛營 蹺陛 殮溘擊 鏃模ж樟蝗棲棻.");
			this.choiceMoney();
		}
		
	}//plusCash 部
	
} //SalesManagement 部


public class AdminPayment
{
	public static void main(String[] args)
	{

	}
}