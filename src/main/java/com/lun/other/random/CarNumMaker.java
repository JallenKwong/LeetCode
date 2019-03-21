package com.lun.other.random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 用于数据库填充示例数据
 * 
 * @author 白居布衣
 *
 */
public class CarNumMaker {
	public static void main(String[] args){
//		CarNumMaker.makeChineseName();
		CarNumMaker.makeTime();
	}
	
	public void makeCarNum(){
		String str = "ABCDEFGHIJKLMNOPQRSTUVWSYZ0123456789";
		char[] array = str.toCharArray();
		Random rand = new Random(System.currentTimeMillis());
		StringBuilder sb ;
		for(int i = 0; i!= 20;i++ ){
			sb = new StringBuilder();
			for(int j = 0; j != 5;j++){
				sb.append(array[rand.nextInt(array.length)]);
			}
			System.out.println(sb);
		}
	}
	
	public static  void makeTime(){
		int[] hour = new int[24];
		int[] min = new int[60];
		int[] sec = new int[60];
		
		String[] year = {"2014","2015","2016","2013"};
		int[] month = new int[12];
		int[] day = new int[28];
		
		for(int i = 0; i != 24; i++){
			hour[i] = i;
		}
		for(int i = 0; i != 60; i++){
			min[i] = i;
			sec[i] = i;
		}
		for(int i = 0; i != 12; i++){
			month[i] = i + 1;
		}
		for(int i = 0; i != 28; i++){
			day[i] = i + 1;
		}
		
		Random rand = new Random(System.currentTimeMillis());
		StringBuilder sb ;
		int d;
		int m;
		int h;
		int mi;
		int s;
		for(int i = 0; i!= 20;i++ ){
			sb = new StringBuilder();
			d = day[rand.nextInt(day.length)];
			if(d < 10){
				sb.append(0);
			}
			sb.append(d);
			sb.append('-');
			m = month[rand.nextInt(month.length)];
			if(m < 10){
				sb.append(0);
			}
			sb.append(m);
			sb.append('-');
			sb.append(year[rand.nextInt(year.length)]);
			
			sb.append(' ');
			
			h = hour[rand.nextInt(hour.length)];
			if(h < 10){
				sb.append(0);
			}
			sb.append(h);
			sb.append(":");
			
			mi = min[rand.nextInt(min.length)];
			if(mi < 10){
				sb.append(0);
			}
			sb.append(mi);
			sb.append(":");
			
			s = sec[rand.nextInt(sec.length)];
			if(s < 10){
				sb.append(0);
			}
			sb.append(s);
			
			
			System.out.println(sb);
		}
	}
	
	
	public static void makeName(){
		String str = "abcdefghijklmnopqrstuvwsyz";
		char[] array = str.toCharArray();
		Random rand = new Random(System.currentTimeMillis());
		StringBuilder sb ;
		for(int i = 0; i!= 20;i++ ){
			sb = new StringBuilder();
			for(int j = 0; j != 5;j++){
				sb.append(array[rand.nextInt(array.length)]);
			}
			System.out.println(sb);
		}
	}
	
	public String makeChineseName(){
		String xing = "赵钱孙李周吴郑王冯陈楮卫蒋沈韩杨朱秦尤许何吕施张孔曹严华";
		char[] array1 = xing.toCharArray();
		String name = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行翠华摇摇行复止西出都门百余里六军不发无奈何宛转蛾眉马前死花钿委地无人收翠翘金雀玉搔头君王掩面救不得回看血泪相和流黄埃散漫风萧索云栈萦纡登剑阁峨嵋山下少人行旌旗无光日色薄蜀江水碧蜀山青圣主朝朝暮暮情行宫见月伤心色夜雨闻铃肠断声天旋地转回龙驭到此踌躇不能去马嵬坡下泥土中不见玉颜空死处君臣相顾尽沾衣东望都门信马归归来池苑皆依旧太液芙蓉未央柳芙蓉如面柳如眉对此如何不泪垂春风桃李花开日秋雨梧桐叶落时西宫南内多秋草落叶满阶红不扫梨园弟子白发新椒房阿监青娥老夕殿萤飞思悄然孤灯挑尽未成眠迟迟钟鼓初长夜耿耿星河欲曙天鸳鸯瓦冷霜华重翡翠衾寒谁与共悠悠生死别经年魂魄不曾来入梦临邛道士鸿都客能以精诚致魂魄为感君王辗转思遂教方士殷勤觅排空驭气奔如电升天入地求之遍上穷碧落下黄泉两处茫茫皆不见忽闻海上有仙山山在虚无缥渺间楼阁玲珑五云起其中绰约多仙子中有一人字太真雪肤花貌参差是金阙西厢叩玉扃转教小玉报双成闻道汉家天子使九华帐里梦魂惊揽衣推枕起徘徊珠箔银屏迤逦开云鬓半偏新睡觉花冠不整下堂来风吹仙袂飘飘举犹似霓裳羽衣舞玉容寂寞泪阑干梨花一枝春带雨含情凝睇谢君王一别音容两渺茫昭阳殿里恩爱绝蓬莱宫中日月长回头下望人寰处不见长安见尘雾惟将旧物表深情钿合金钗寄将去钗留一股合一扇钗擘黄金合分钿但教心似金钿坚天上人间会相见临别殷勤重寄词词中有誓两心知七月七日长生殿夜半无人私语时在天愿作比翼鸟在地愿为连理枝天长地久有时尽此恨绵绵无绝期";
		char[] array2 = name.toCharArray();
		Random rand = new Random(System.currentTimeMillis());
		StringBuilder sb = new StringBuilder();
		sb.append(array1[rand.nextInt(array1.length)]);
		sb.append(array2[rand.nextInt(array2.length)]);
		sb.append(array2[rand.nextInt(array2.length)]);
		return sb.toString();
	}
	
	public String makeRandomNum(int n){
		Random rand = new Random(System.currentTimeMillis());
		Set<Integer> set = new HashSet<>();
		int t = rand.nextInt(1000);
		set.add(t);
		if(set.contains(t)){
			t = rand.nextInt(1000);
		}
		StringBuilder sb = new StringBuilder();
		if(t < 10){
			sb.append("00");
		}
		else if(t >= 10 && t < 99){
			sb.append("0");
		}
		sb.append(t);
		return sb.toString();
		
	}
}
