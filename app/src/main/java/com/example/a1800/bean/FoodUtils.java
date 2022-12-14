package com.example.a1800.bean;

import com.example.a1800.R;

import java.util.ArrayList;
import java.util.List;

public class FoodUtils {
    private static final String[] food = { "淄博豆腐箱", "朝天锅", "拔丝山药", "把子肉", "葱爆肉", "葱烧海参", "德州扒鸡", "锅塌豆腐", "黄焖鸡米饭", "九转大肠",
            "老厨白菜", "枣庄辣子鸡", "木须肉", "四喜丸子", "糖醋里脊", "糖醋鲤鱼", "一品豆腐", "油爆双脆", "油焖大虾",
            "宫保鸡丁", "口水鸡", "回锅肉", "辣子鸡", "麻婆豆腐", "泡椒腰花", "水煮肉片", "水煮鱼", "酸菜鱼", "鱼香茄子", "鱼香肉丝", "四川麻辣火锅底料",
            "白灼菜心", "豉油鸡", "橙汁排骨", "火腿蛋丝粥", "菠萝咕咾肉", "鲜虾云吞面", "叉烧肉", "白灼虾", "姜撞奶", "白切鸡"};
    private static final String[] jianjie = {
            "淄博豆腐箱是博山传统名吃，属于鲁菜系。",
            "朝天锅是山东潍坊地区传统名吃，属鲁菜系。",
            "拔丝山药，能拔出长丝一丈，脆甜香酥，属鲁菜系。",
            "把子肉是淮海地区经典的名菜之一，属于鲁菜系。",
            "葱爆肉色泽棕褐，味咸鲜，肉质鲜嫩，属鲁菜系。",
            "葱烧海参，是中华特色美食，鲁菜经典名菜。",
            "德州扒鸡制作技艺为国家非物质文化遗产，鲁菜经典。",
            "锅塌豆腐是山东经典的特色名菜之一，属于鲁菜。",
            "黄焖鸡米饭又叫香辣鸡煲或浓汁香辣鸡煲饭，鲁菜名吃。",
            "九转大肠，原名为红烧大肠，是济南传统名菜，属鲁菜。",
            "老厨白菜滑嫩味美，开胃下饭，老少皆宜，属鲁菜。",
            "枣庄辣子鸡，山东枣庄特色名吃，鲜、辣、香，属鲁菜。",
            "木须肉原名木樨肉，是一道常见的特色传统名菜，鲁菜。",
            "四喜丸子寓人生福、禄、寿、喜四大喜事，属鲁菜",
            "糖醋里脊是经典传统名菜之一，被评为山东十大经典名菜",
            "糖醋鲤鱼是一道山东济南传统名菜，鲁菜的代表菜品之一",
            "一品豆腐，是一道经典的特色名菜，属于孔府菜。",
            "油爆双脆是中餐里制作难度最大的菜肴之一，属鲁菜。",
            "油焖大虾主要食材为清明前渤海湾的大对虾，属鲁菜。",
            "宫保鸡丁是一道闻名中外的特色传统名菜，四川十大名菜",
            "口水鸡是中国四川传统特色菜肴，属于川菜系中的凉菜。",
            "回锅肉，口味独特，色泽红亮，肥而不腻，属川菜系列。",
            "辣子鸡，成菜色泽棕红油亮，麻辣味浓，一道经典的川菜",
            "麻婆豆腐其口味独特，口感顺滑，四川十大经典名菜。",
            "泡椒腰花是川菜中大受欢迎的一道菜。",
            "水煮肉片肉味香辣，软嫩，易嚼。属川菜中著名的家常菜",
            "水煮鱼油而不腻、辣而不燥、麻而不苦、肉质滑嫩，属川菜",
            "酸菜鱼以其特有的调味和独特的烹调技法而著称，属川菜",
            "鱼香茄子其味厚重悠长，余味缭绕，回味无穷，属川菜",
            "鱼香肉丝色泽棕红，咸鲜酸甜兼备，葱姜蒜香浓郁，属川菜",
            "四川麻辣火锅，口味是麻辣，工艺是煮，中级难度。",
            "白灼菜心品质脆嫩，风味独特，营养丰富，广东传统名菜。",
            "豉油鸡又称酱油鸡，色泽鲜亮，鸡肉嫩滑，属于粤菜。",
            "橙汁排骨是广东省传统的特色小吃，属粤菜",
            "火腿蛋丝粥是一道菜品，主料有鸡蛋、火腿。",
            "咕咾肉又称咕噜肉，是广东的一道特色传统名菜，属粤菜。",
            "鲜虾云吞面，是广州人喜爱的传统风味的小食之一。",
            "叉烧肉为烧烤肉的一种，是粤菜中极具代表性一道菜。",
            "白灼虾是一道传统名菜，广州人喜欢用白灼之法来做虾。",
            "姜撞奶味道香醇爽滑，甜中微辣且风味独特，有暖胃表热作用",
            "白切鸡又叫白斩鸡，是中国八大菜之一粤菜系鸡肴中的一种",








    };
    private static final int[] resId = { R.mipmap.zibodoufuxiang, R.mipmap.chaotianguo,
            R.mipmap.basishanyao, R.mipmap.bazirou ,
            R.mipmap.congbaorou, R.mipmap.congshaohaishen, R.mipmap.dezhoupaji,
            R.mipmap.guotadoufu, R.mipmap.huangmenji, R.mipmap.jiuzhuandachang,
            R.mipmap.laochubaicai, R.mipmap.zaozhuanglaziji, R.mipmap.muxurou,
            R.mipmap.sixiwanzi, R.mipmap.tangculiji, R.mipmap.tangculiyu,
            R.mipmap.yipindoufu, R.mipmap.youbaoshuangcui, R.mipmap.youmendaxia,
            R.mipmap.gongbaojiding, R.mipmap.koushuiji, R.mipmap.huiguorou,
            R.mipmap.laziji, R.mipmap.mapodoufu, R.mipmap.paojiaoyaohua,
            R.mipmap.shuizhuroupian, R.mipmap.shuizhuyu, R.mipmap.suancaiyu,
            R.mipmap.yuxiangqiezi, R.mipmap.yuxiangrousi, R.mipmap.huoguodiliao,
            R.mipmap.baizhuocaixin, R.mipmap.douchiji, R.mipmap.chengzhipaigu,
            R.mipmap.huotuidansizhou, R.mipmap.boluogulaorou, R.mipmap.xianxiayuntunmian,
            R.mipmap.chashaorou, R.mipmap.baizhuoxia, R.mipmap.jiangzhuangnai, R.mipmap.baiqieji
            };
    private static final String [] foodneirong = {
            "主料：豆腐500g\n" +
                    "辅料：猪肉馅50g 海米20g 水发木耳适量 水发香菇适量 葱适量 精盐适量 食油500ml 淀粉适量 香油适量 料酒适量 陈醋适量 酱油适量 姜适量 蒜适量\n" +
                    "做法：淄博豆腐箱的做法\n" +
                    "1主要配料。\n" +
                    "2水发香菇、木耳切成小丁、海米水发后切碎。\n" +
                    "3炸制豆腐： 豆腐切长宽条。\n" +
                    "4把豆腐上笼蒸15分钟，主要是去掉部分水分。\n" +
                    "5把蒸过的豆腐切成长5厘米，宽3厘米，厚3厘米的长条。\n" +
                    "6锅里加宽油。\n" +
                    "7油8成热后放入豆腐炸制。\n" +
                    "8豆腐炸制金黄色即可。\n" +
                    "9炒制肉馅： 锅里油热后放入葱姜蒜末炒香。\n" +
                    "10放入猪肉馅翻炒至变色成粒状。\n" +
                    "11倒入酱油、加入精盐。\n" +
                    "12放入木耳、香菇翻炒。\n" +
                    "13加入海米粒翻炒均匀。\n" +
                    "14滴入香油，翻炒均匀即可。\n" +
                    "15用刀子在豆腐上切开口，成小门扇状。\n" +
                    "16用细铁丝做成边长为2厘米的小方框，一头留有握把。\n" +
                    "17把小工具从豆腐的一头插入，慢慢的往另一个方向拉动。\n" +
                    "18完整的豆腐芯就出来了。\n" +
                    "19处理好的豆腐箱和挖出来的豆腐芯。\n" +
                    "20用小勺子慢慢往豆腐箱里填充炒制好的肉馅。\n" +
                    "21把填好肉馅的豆腐箱上笼蒸10分钟，让豆腐和肉馅亲密接触。\n" +
                    "22炒制卤汁： 锅里油热后放入蒜片炒香。\n" +
                    "23倒入酱油、少许精盐，一碗清水，大火烧开。\n" +
                    "24放入西红柿丁，黄瓜片，木耳。\n" +
                    "25加入一勺子白糖，提鲜。\n" +
                    "26烹入陈醋或白醋。\n" +
                    "27最后倒入水淀粉，勾芡。把烧制好的卤汁浇在豆腐箱上即可。",
            "主料：猪肠1盘 猪肚1盘 猪肉500g\n" +
                    "辅料：大葱适量 香菜适量 高汤适量 陈皮适量 炖肉料包1包 香菇适量 鱼丸适量 虾适量 干豆腐适量 菠菜适量 生菜适量 海带根适量 火锅面1包 粉丝100g 水烙馍适量 金针菇适量 黑木耳适量 花椒适量 大料适量 精盐适量 料酒适量 鸡精适量\n" +
                    "做法：朝天锅的做法\n" +
                    "1首先将猪肠放入盐水中反复搓洗，然后放入锅中，加入葱，姜，花椒大料，煮一会儿，去除异味，否则放入火锅内做汤底时，会盖过整个锅的香味。朝天锅的做法步骤1\n" +
                    "2将猪肠找出，切段。朝天锅的做法步骤2\n" +
                    "3将猪肚放入盐水中反复搓洗，切成条。朝天锅的做法步骤3\n" +
                    "4在火锅中放入适量水，烧开。朝天锅的做法步骤4\n" +
                    "5准备好炖肉料和自家保存的陈皮（有两年的时间了，这个越久药用价值越强，而且会加强食物的食补功效）。朝天锅的做法步骤5\n" +
                    "6将炖肉料、陈皮、一盒高汤，放入烧开的锅中，放入盐，少量料酒，鸡精。朝天锅的做法步骤6\n" +
                    "7煮一会，让调味料的味道浸入汤水中。朝天锅的做法步骤7\n" +
                    "8将冻的猪肉卷从冰箱中取出，如果取早了，肉卷就不成形了，不好控制量。朝天锅的做法步骤8\n" +
                    "9将猪肉卷、猪肚、猪肠放入锅中，将其中的味和油都煮到锅中。朝天锅的做法步骤9\n" +
                    "10葱和香菜洗净。朝天锅的做法步骤10\n" +
                    "11此时将葱和香菜切碎，交香菜洒在火锅表面，解油腻，增香。朝天锅的做法步骤11\n" +
                    "12下面准备配菜和主食：将菠菜去根，洗净，装盘。朝天锅的做法步骤12\n" +
                    "13将干豆腐卷成卷，用牙签固定，装盘。朝天锅的做法步骤13\n" +
                    "14将省事根洗净，切菱形片。朝天锅的做法步骤14\n" +
                    "15将虾放入盐水中，放入姜片，煮熟，当配菜。朝天锅的做法步骤15\n" +
                    "16将金针菇去根，洗净，装盘。朝天锅的做法步骤16\n" +
                    "17将生菜去根，洗净，装盘。朝天锅的做法步骤17\n" +
                    "18将香菇去根，洗净，切十字花刀，装盘。朝天锅的做法步骤18\n" +
                    "19准备粉丝和火锅面条。朝天锅的做法步骤19\n" +
                    "20野生黑木耳提前泡发，去根，装盘。朝天锅的做法步骤20\n" +
                    "21将鱼丸装盘，将干豆腐切宽片，卷成卷，装盘。朝天锅的做法步骤21\n" +
                    "22将水烙馍准备好，这是早上提前做好的。朝天锅的做法步骤22\n" +
                    "23如果你吃火锅吃腻了火锅面、粉丝、饺子，那就一定要试试这种吃法，超级好吃的肉肉，吸吮了火锅的汤汁与香味，加上自己喜欢的配菜，用水烙馍卷在一起，那味道超棒的，现在来介绍吃法：将水烙馍平铺在盘子上。朝天锅的做法步骤23\n" +
                    "24从火锅中捞出肉，铺在馍上。朝天锅的做法步骤24\n" +
                    "25洒上葱花或香菜。朝天锅的做法步骤25\n" +
                    "26如图从一端开始卷，卷紧一些。朝天锅的做法步骤26\n" +
                    "27如图卷好。还有另一种卷法，可以再饼上先铺一层生菜，重复（2）—（4）的步骤。朝天锅的做法步骤27",
            "主料：山药300g\n" +
                    "辅料：油适量 白糖100g 芝麻适量 香油适量\n" +
                    "做法： 拔丝山药的做法\n" +
                    "1准备好所用食材。拔丝山药的做法\n" +
                    "2土豆洗净，去皮。切成大小均匀的滚刀块。拔丝山药的做法\n" +
                    "3锅中注油，烧热，加入山药块。拔丝山药的做法\n" +
                    "4炸熟透至色泽金黄色。捞出控油。拔丝山药的做法\n" +
                    "5将油全部倒出，不要刷锅，倒入白糖。拔丝山药的做法\n" +
                    "6小火，要不停地用铲子轻轻搅动，使白糖至融化。拔丝山药的做法\n" +
                    "7将白糖慢慢熬至浅棕红色，泡沫由大变小。拔丝山药的做法\n" +
                    "8迅速下入炸好的山药块，快速翻炒均匀。拔丝山药的做法\n" +
                    "9加入芝麻快速翻拌均匀。拔丝山药的做法\n" +
                    "10装在抹上香油的盘子即可",
            "主料：带皮猪肉700g 冰糖40g\n" +
                    "辅料：酱油4汤匙 生抽3汤匙 生姜10g 大葱25g 八角4g 桂皮2g 料酒1汤匙\n" +
                    "做法： 把子肉的做法\n" +
                    "1猪肉洗净，猪皮上残留的猪毛用镊子拔去或者用刀刮掉。把子肉的做法步骤1\n" +
                    "2猪肉切成厚约1厘米的条。把子肉的做法步骤2\n" +
                    "3猪肉放入冷水锅内，大火烧开炒烫2分钟。把子肉的做法步骤3\n" +
                    "4捞出猪肉冲洗干净。把子肉的做法步骤4\n" +
                    "5葱姜切大片。把子肉的做法步骤5\n" +
                    "6起油锅，放入冰糖，小火炒至冰糖溶化成浅咖啡色泡沫。把子肉的做法步骤6\n" +
                    "7放入猪肉翻炒上色。把子肉的做法步骤7\n" +
                    "8再放入酱油、生抽、料酒炒匀。把子肉的做法步骤8\n" +
                    "9先把大葱、生姜、八角、桂皮放入砂锅内。把子肉的做法步骤9\n" +
                    "10再放入已经炒至上色的猪肉。把子肉的做法步骤10\n" +
                    "11把锅内的酱油汁也倒入砂锅内。把子肉的做法步骤11\n" +
                    "12砂锅内再放入适量的水没过猪肉，放在炉火上大火烧开3分钟。把子肉的做法步骤12\n" +
                    "13撇去浮沫。把子肉的做法步骤13\n" +
                    "14砂锅加盖转小火煮90分钟，最后开大火把锅内的汤汁收浓即可。",

            "主料：猪肉200g\n" +
                    "辅料：油适量 盐适量 葱白适量 甜面酱1大勺 芝麻油1勺 花椒粉适量 醋适量 酱油适量 料酒适量\n" +
                    "做法：葱爆肉的做法\n" +
                    "1准备食材。葱爆肉的做法步骤1\n" +
                    "2将猪肉切成薄片。葱爆肉的做法步骤2\n" +
                    "3加入一大勺甜面酱，一勺芝麻油。葱爆肉的做法步骤3\n" +
                    "4用手抓匀腌制十五分到二十分钟入味。葱爆肉的做法步骤4\n" +
                    "5葱白竖切成丝备用。葱爆肉的做法步骤5\n" +
                    "6锅中加入适量油，将腌制好的肉片放入。葱爆肉的做法步骤6\n" +
                    "7大火快速划炒。葱爆肉的做法步骤7\n" +
                    "8当肉片变色，加入葱白丝。葱爆肉的做法步骤8\n" +
                    "9略翻炒，加入由一勺醋，四分之一勺花椒粉，一勺料酒，少许鸡精，少许生抽和盐调成的碗汁。葱爆肉的做法步骤9\n" +
                    "10快速翻炒至酱汁吸收出锅。",

            "主料：大葱葱白2段\n" +
                    "辅料：油5勺 盐1/2勺 蚝油2勺 干淀粉1/2勺 清水适量\n" +
                    "做法：葱烧海参的做法\n" +
                    "1海参洗干净。葱烧海参的做法步骤1\n" +
                    "2竖向切，一只海参切3刀。葱烧海参的做法步骤2\n" +
                    "3葱白竖向切，对半切，再将一半对半切。葱烧海参的做法步骤3\n" +
                    "4锅内大火烧热油。葱烧海参的做法步骤4\n" +
                    "5转中火，下葱白。葱烧海参的做法步骤5\n" +
                    "6葱白出香味立刻关火称出。葱烧海参的做法步骤6\n" +
                    "7锅内留葱油，开火，加蚝油。葱烧海参的做法步骤7\n" +
                    "8迅速滑散。葱烧海参的做法步骤8\n" +
                    "9加清水，中火。葱烧海参的做法步骤9\n" +
                    "10清水烧开。葱烧海参的做法步骤10\n" +
                    "11加入海参，翻拌均匀。葱烧海参的做法步骤11\n" +
                    "12干淀粉加水调成湿淀粉。葱烧海参的做法步骤12\n" +
                    "13海参烧开锅，转大火。葱烧海参的做法步骤13\n" +
                    "14加湿淀粉，迅速拌匀。葱烧海参的做法步骤14\n" +
                    "15汤汁快收干后，立刻加之前炒好的葱白。葱烧海参的做法步骤15\n" +
                    "16稍微散点盐，出锅。",

            "主料：活鸡一只\n" +
                    "辅料：花生油1500克 食盐25克 酱油150克 姜5克 口蘑5克 丁香1克 砂仁1克 草果1克 白芷1克 茴香1克\n" +
                    "做法：德州扒鸡的做法\n" +
                    "1.活鸡宰杀褪毛，取出内脏，清水洗净。将鸡的左翅自脖下刀口插入，使翅尖由嘴内侧伸出，别在鸡背上；将鸡的右翅也别在在鸡背上。再把腿骨用刀背轻轻砸断并起交叉，将两爪塞入鸡腹内，晾干水份。\n" +
                    "2.饴糖加清水50克调匀地抹在鸡身上。炒锅烧热加油至八成热，将鸡入油炸药至金黄色捞出，沥干油。\n" +
                    "3.锅内加清水（以淹没鸡为度），把炸药好的鸡放入锅，加五香药料（用布包扎好），生姜、精盐、口蘑、酱油。旺火烧沸，撇去浮沫，移微火上焖煮半小时，至鸡酥烂时即可。捞鸡时注意保持鸡皮不破，整鸡不碎。",
            "主料：北豆腐200g 鸡蛋2个\n" +
                    "辅料：盐2g 白胡椒2g 酱油1勺 糖3g 鸡汤1碗 淀粉适量 食用油适量 葱末适量\n" +
                    "做法：锅塌豆腐的做法\n" +
                    "1将豆腐洗净沥干，切成0.6厘米厚、3.3厘米见方的块。经典锅塌豆腐的做法步骤1\n" +
                    "2放入盘内，加盐 白胡椒拌匀。经典锅塌豆腐的做法步骤2\n" +
                    "3煎锅放油烧至七成热。经典锅塌豆腐的做法步骤3\n" +
                    "4豆腐片入淀粉粘匀。经典锅塌豆腐的做法步骤4\n" +
                    "5再将每片豆腐均粘匀鸡蛋液。经典锅塌豆腐的做法步骤5\n" +
                    "6逐片下入七成热的油内。经典锅塌豆腐的做法步骤6\n" +
                    "7剩下的蛋液均匀的倒在豆腐上。经典锅塌豆腐的做法步骤7\n" +
                    "8煎至一面金黄翻面再煎另一面。经典锅塌豆腐的做法步骤8\n" +
                    "9煎至两面金黄，倒入鸡汤。经典锅塌豆腐的做法步骤9\n" +
                    "10烧开加入酱油 糖小火焖至。经典锅塌豆腐的做法步骤10\n" +
                    "11汤汁收干勾入薄芡，经典锅塌豆腐的做法步骤11\n" +
                    "12表面撒上葱碎即可。",

            "主料：鸡腿1个 全鸡翅2个 香菇10朵 青椒2个 红椒1个\n" +
                    "辅料：葱姜适量 蚝油30g 料酒30ml 生抽20ml 五香粉2g 蒜瓣4个 干辣椒3个 糖2g 鸡精适量\n" +
                    "做法：黄焖鸡米饭的做法\n" +
                    "1准备好所有的食材。黄焖鸡米饭的做法步骤1\n" +
                    "2鸡腿，鸡翅洗净后切小块，加入，蚝油，生抽，料酒，糖，五香粉腌制20分钟。黄焖鸡米饭的做法步骤2\n" +
                    "3香菇提前泡发洗净去蒂切块，青红椒去籽切块，葱姜蒜，干辣椒切碎。黄焖鸡米饭的做法步骤3\n" +
                    "4炒锅倒油放入葱姜，蒜，干辣椒炒香。黄焖鸡米饭的做法步骤4\n" +
                    "5倒入腌制的鸡块翻炒。黄焖鸡米饭的做法步骤5\n" +
                    "6加入香菇块继续翻炒。黄焖鸡米饭的做法步骤6\n" +
                    "7炒至鸡肉变色微焦黄关火。黄焖鸡米饭的做法步骤7\n" +
                    "8把炒过的鸡肉香菇放入压力锅，加入泡香菇的水。黄焖鸡米饭的做法步骤8\n" +
                    "9水分不要太多，稍微漫过鸡肉即可。黄焖鸡米饭的做法步骤9\n" +
                    "10然后加盖大火煮上10分钟关火，再焖至5分钟。黄焖鸡米饭的做法步骤10\n" +
                    "11开盖后把鸡肉倒入砂锅大火2分钟收汁。黄焖鸡米饭的做法步骤11\n" +
                    "12加入青红椒块，和少许盐。黄焖鸡米饭的做法步骤12\n" +
                    "13加少许鸡精关火。黄焖鸡米饭的做法步骤13\n" +
                    "14砂锅放入托盘，搭配一碗米饭和一碗玉米糊即可上桌。",

            "主料：熟猪大肠500g\n" +
                    "辅料：油适量 盐适量 肉桂粉5g 砂仁粉5g 胡椒粉5g 白糖1勺 葱末5g 姜末5g 蒜末5g 老抽1勺 料酒1勺 花椒油1勺 白醋1勺\n" +
                    "做法：九转大肠的做法\n" +
                    "1熟猪大肠切成2公分长的扳指段九转大肠的做法步骤1\n" +
                    "2锅内坐水，水开后把切好的猪大肠焯水去油，捞出控水备用九转大肠的做法步骤2\n" +
                    "3另起油锅，宽油，油七成热后倒入焯水后的猪大肠九转大肠的做法步骤3\n" +
                    "4把猪大肠炸制金黄色，捞出控净油九转大肠的做法步骤4\n" +
                    "5锅内留底油放入葱姜蒜末爆香九转大肠的做法步骤5\n" +
                    "6倒入老抽、加少许精盐翻炒九转大肠的做法步骤6\n" +
                    "7倒入白糖九转大肠的做法步骤7\n" +
                    "8倒入料酒九转大肠的做法步骤8\n" +
                    "9烹入白醋或陈醋九转大肠的做法步骤9\n" +
                    "10倒入清汤或开水九转大肠的做法步骤10\n" +
                    "11大火翻炒汤汁九转大肠的做法步骤11\n" +
                    "12倒入控净油的猪大肠段慢火煨制九转大肠的做法步骤12\n" +
                    "13放肉桂粉、砂仁粉、胡椒粉大火收汁九转大肠的做法步骤13\n" +
                    "14倒入花椒油翻炒均匀，即可出锅装盘，撒上香葱花或香菜末",

            "主料：白菜300g 五花肉100g\n" +
                    "辅料：油适量 盐适量 红薯粉条适量 葱适量 姜适量 香菜适量 八角适量 干红辣椒适量 酱油1勺 芝麻油适量\n" +
                    "做法：老厨白菜的做法\n" +
                    "1准备食材。老厨白菜的做法步骤1\n" +
                    "2红薯粉条提前用温水泡软至无白芯。老厨白菜的做法步骤2\n" +
                    "3白菜用手撕成大块。老厨白菜的做法步骤3\n" +
                    "4五花肉切成大薄片。老厨白菜的做法步骤4\n" +
                    "5锅中放适量油，加入五花肉煸炒。老厨白菜的做法步骤5\n" +
                    "6煸炒至五花肉表层微微泛黄，加入八角和辣椒丝略炒。老厨白菜的做法步骤6\n" +
                    "7加入葱姜片略炒。老厨白菜的做法步骤7\n" +
                    "8加入白菜快速翻炒。老厨白菜的做法步骤8\n" +
                    "9当白菜略变软时，加入粉条。老厨白菜的做法步骤9\n" +
                    "10加入一勺酱油。老厨白菜的做法步骤10\n" +
                    "11加入适量盐快速翻炒。老厨白菜的做法步骤11\n" +
                    "12关火，放入适量香菜和几滴芝麻油出锅。",

            "主料：小公鸡半只\n" +
                    "辅料：辣椒半盘子 花椒一勺 八角2个 尖辣椒10个 蒜五瓣 葱一根 姜一块 香菜两棵 香叶两片 桂皮两片 白芷两片 干辣椒六个\n" +
                    "做法：枣庄辣子鸡的做法\n" +
                    "1本地公鸡（黑腿本地小鸡）剁成小块\n" +
                    "2本地辣椒切好\n" +
                    "3葱.姜.蒜.干辣椒切好\n" +
                    "4尖辣椒切成两半（超辣的，所以要根据个人口味定量）\n" +
                    "5锅烧热，放油，待油八成热时放入花椒，待花椒炸出香味稍稍变色时用漏勺捞出，然后放入八角、红辣椒，炸出香味\n" +
                    "6放入姜、切好的鸡块，迅速翻炒，待鸡肉变色后放醋、葱，继续翻炒（里面有些鸡胗鸡肝和鸡腰）\n" +
                    "7出来葱香味后酱翻炒均匀后放老抽（不要放多了）、料酒，翻炒到颜色均匀后加入白开水少许，加入香叶、桂皮，上盖紧煮慢炖15分钟，\n" +
                    "8放入鲜辣椒、蒜、香菜，翻炒均匀，\n" +
                    "9出锅。(比较家常的做法是再放一些土豆片、木耳，荤素搭配，味道也很好。)",

            "主料：猪肉片160g 黑木耳10g 黄瓜150g 鸡蛋2个\n" +
                    "辅料：油适量 盐适量 酱油适量 胡椒粉适量 白砂糖适量 淀粉适量\n" +
                    "做法：木须肉的做法\n" +
                    "1将黄瓜先斜切段，再竖起来切片，即成为漂亮的菱形片。木须肉的做法步骤1\n" +
                    "2将葱、姜、蒜处理好备用。木须肉的做法步骤2\n" +
                    "3木耳泡发清洗干净，摘成小朵。木须肉的做法步骤3\n" +
                    "4猪肉切薄片备用。木须肉的做法步骤4\n" +
                    "5将猪肉片放入小碗中，调入盐、糖、酱油、胡椒、葱姜、淀粉和一点蛋清。木须肉的做法步骤5\n" +
                    "6余下的鸡蛋加点盐和葱打散在碗中备用。木须肉的做法步骤6\n" +
                    "7锅内放油，油热下蛋液。木须肉的做法步骤7\n" +
                    "8蛋液遇热油膨胀，这时快速滑炒两下就盛出。木须肉的做法步骤8\n" +
                    "9再起油锅，油热下调好味的肉片。木须肉的做法步骤9\n" +
                    "10滑炒断生盛出备用。木须肉的做法步骤10\n" +
                    "11第三次起油锅，下黄瓜、木耳和蒜，翻炒变色后加盐调味。木须肉的做法步骤11\n" +
                    "12将前面炒好的肉片倒回锅中，炒均。木须肉的做法步骤12\n" +
                    "13最后将鸡蛋也倒回锅中，炒均，即可出锅。",

            "主料：猪肉500g 马蹄100g 生粉100g 鸡蛋2个\n" +
                    "辅料：盐3勺 料酒1勺 鸡精适量 胡椒粉适量 老抽3/2勺 姜末适量 油适量 糖2勺 生菜适量 水淀粉适量\n" +
                    "1马蹄（又称荸荠）去皮洗净四喜丸子的做法步骤1\n" +
                    "2切成细末四喜丸子的做法步骤2\n" +
                    "3500克猪肉（肥瘦掺半）搅成蓉，加入100克生粉，两个鸡蛋，两勺盐，一勺料酒，适量鸡精，胡椒粉，一小勺老抽，切好的马蹄末，姜末，少量水，搅打上劲四喜丸子的做法步骤3\n" +
                    "4分成四等分，制成四个大丸子四喜丸子的做法步骤4\n" +
                    "5油锅倒大半锅油，油温烧至五成热时，下入丸子，小火炸至金黄四喜丸子的做法步骤5\n" +
                    "6捞出滤油四喜丸子的做法步骤6\n" +
                    "7将油盛起，锅中留少量底油，加入半锅水，少量盐，鸡精，一勺老抽，两勺糖，盖上锅盖，大火烧开后改小火闷煮四喜丸子的做法步骤7\n" +
                    "8待水份差不多收干时，将丸子盛起于铺好生菜的盘中，将锅中汤汁重新烧开，加入水淀粉勾芡四喜丸子的做法步骤8\n" +
                    "9最后浇在丸子上即可",

            "主料：里脊肉400g\n" +
                    "辅料：油适量 盐适量 料酒15ml 鸡蛋1个 番茄酱30g 醋25ml 白糖40g 酱油20ml 鸡精少许 淀粉适量 葱适量 蒜适量 姜适量\n" +
                    "做法：糖醋里脊的做法\n" +
                    "1里脊切小指粗般长条加入盐，料酒少许白糖腌制片刻。糖醋里脊的做法步骤1\n" +
                    "2取一个小碗加入番茄酱、酱油、醋、白糖、鸡精，清水拌均匀备用。糖醋里脊的做法步骤2\n" +
                    "3腌制过的里脊肉加入一个鸡蛋再次拌均匀。糖醋里脊的做法步骤3\n" +
                    "4然后把肉条放入干淀粉中均匀裹满淀粉。糖醋里脊的做法步骤4\n" +
                    "5油锅烧至7成热放入肉条炸制。糖醋里脊的做法步骤5\n" +
                    "6肉条发白捞出。糖醋里脊的做法步骤6\n" +
                    "7然后再次复炸一遍，糖醋里脊的做法步骤7\n" +
                    "8肉条金黄捞出沥油备用。糖醋里脊的做法步骤8\n" +
                    "9炒锅倒少许油爆香葱、姜、蒜。糖醋里脊的做法步骤9\n" +
                    "10然后倒入调好的料子。糖醋里脊的做法步骤10\n" +
                    "11炒至出香淋入水淀粉勾薄芡。糖醋里脊的做法步骤11\n" +
                    "12倒入肉条快速翻炒。糖醋里脊的做法步骤12\n" +
                    "13肉条均匀沾裹汤汁关火。",

            "主料：鲤鱼600g\n" +
                    "辅料：葱5g 姜5g 蒜5g 生抽20ml 糖30g 醋40ml 料酒15ml 番茄酱50g 盐3g 淀粉10g 面粉50g\n" +
                    "做法：糖醋鲤鱼的做法\n" +
                    "1鲤鱼收拾干净后，沥干水，在鱼身两面个2.5厘米各斜切一刀（先立切1厘米深，再平切2厘米深）糖醋鲤鱼的做法步骤1\n" +
                    "2用胡椒粉、生抽和少许盐略腌糖醋鲤鱼的做法步骤2\n" +
                    "3将生抽、糖、醋、料酒、清水调成糖醋汁待用糖醋鲤鱼的做法步骤3\n" +
                    "4淀粉、面粉调成糊、均匀抹在腌好的鱼上糖醋鲤鱼的做法步骤4\n" +
                    "5油烧至七成热，，提起鱼尾，先将鱼头入油稍炸，再舀油淋在鱼身上，待面糊凝固时再把鱼慢慢放入油锅内糖醋鲤鱼的做法步骤5\n" +
                    "6待鱼炸至金黄色，捞出控油放入盘中待用糖醋鲤鱼的做法步骤6\n" +
                    "7炒锅内留少许油，放入葱花、姜末、蒜末爆香，再调入番茄酱，倒入调好的汁，加少许湿淀粉收浓糖醋鲤鱼的做法步骤7\n" +
                    "8起锅浇在鱼身上即可",

            "主料：内酯豆腐1盒\n" +
                    "辅料：油适量 盐适量 红辣椒适量 牛肉末适量 花椒粉适量 鸡精适量 姜适量 大蒜适量 鸡蛋适量 生粉适量\n" +
                    "做法：一品豆腐的做法\n" +
                    "1红辣椒洗净、沥干水分，切小丁一品豆腐的做法步骤1\n" +
                    "2姜切片一品豆腐的做法步骤2\n" +
                    "3蒜切小丁一品豆腐的做法步骤3\n" +
                    "4将1、2、3放入料理机打成茸一品豆腐的做法步骤4\n" +
                    "5锅内放少许油，倒入辣椒酱，加入适量盐、花椒粉、鸡精，鱼露调味，不断搅拌熬至自己想要的浓稠度一品豆腐的做法步骤5\n" +
                    "6晾至温热即可装瓶一品豆腐的做法步骤6\n" +
                    "7选择一盒市面上最嫩的内酯豆腐 （这样的豆腐一般用来凉拌或做汤）一品豆腐的做法步骤7\n" +
                    "8小心撕开豆腐表面的包装纸，倒扣过来一品豆腐的做法步骤8\n" +
                    "9用剪刀剪一个小口，然后用轻拍，如果是做给自己吃，也可以用嘴往里吹气一品豆腐的做法步骤9\n" +
                    "10这时候空气会随着这个小口进入盒内，空气进入充分后能看到豆腐和盒底脱开 就得到一块完整的豆腐了！一品豆腐的做法步骤10\n" +
                    "11刀蘸点水，再横着将豆腐切成自己喜欢的大小 竖直对半分豆腐一品豆腐的做法步骤11\n" +
                    "12再横着将豆腐切成自己喜欢的大小一品豆腐的做法步骤12\n" +
                    "13准备姜末、红椒粒一品豆腐的做法步骤13\n" +
                    "14洋葱末、牛肉末 （话说洋葱和牛肉真是绝配！哈哈）一品豆腐的做法步骤14\n" +
                    "15小心将豆腐块在淀粉中裹薄薄一层一品豆腐的做法步骤15\n" +
                    "16再裹一层蛋液一品豆腐的做法步骤16\n" +
                    "17锅内油6、7成热，将豆腐块炸成金黄捞出一品豆腐的做法步骤17\n" +
                    "18炸好的豆腐块装盘摆好一品豆腐的做法步骤18\n" +
                    "19锅内放少许油，倒入牛肉末、红椒粒、洋葱碎翻炒至牛肉变色，调入少许料酒一品豆腐的做法步骤19\n" +
                    "20倒入适量辣椒酱、翻炒均匀，浇淋在豆腐上即可",

            "用料  \n" +
                    "猪肚头\t适量\n" +
                    "鸡珍\t适量\n" +
                    "青笋\t适量\n" +
                    "糖\t适量\n" +
                    "鸡精\t适量\n" +
                    "盐\t适量\n" +
                    "酱油\t适量\n" +
                    "醋\t适量\n" +
                    "料酒\t适量\n" +
                    "油爆双脆的做法  \n" +
                    "将青芛切丁焯熟备用\n" +
                    "用十字花刀将猪肚和鸡珍切成3厘米大小的菊花形，以便快速熟透。\n" +
                    "用水浸泡去油脂\n" +
                    "配料汁:适量糖、鸡精、盐、酱油、醋、料酒等\n" +
                    "将油烧至6分，下切好的猪肚和鸡珍，十秒后捞出\n" +
                    "将配料炒香，放入青笋、猪肚、鸡珍一同炒制，15秒后出锅",

            "主料：虾250g\n" +
                    "辅料：生抽15g 香醋5g 白砂糖12g 水适量 干淀粉2g 姜适量 葱适量 料酒适量 橄榄油适量 盐适量\n" +
                    "做法：油焖大虾的做法\n" +
                    "1将大虾洗净，去掉虾须、虾枪、虾脚、沙线。油焖大虾的做法步骤1\n" +
                    "2倒入适量料酒腌制10分钟。油焖大虾的做法步骤2\n" +
                    "3在腌制虾的同时准备好葱丝、姜片。油焖大虾的做法步骤3\n" +
                    "4将生抽、香醋、白糖、水、干淀粉混合，用勺子搅拌至白糖融化待用。油焖大虾的做法步骤4\n" +
                    "5炒锅置于火上，用中大火，倒入比平时炒菜稍多一些的橄榄油，烧至六成热。油焖大虾的做法步骤5\n" +
                    "6倒入大虾，煎至两面变红出虾油，期间可以用铲子压一压，使得大虾出更多的虾油。油焖大虾的做法步骤6\n" +
                    "7将煎好的大虾盛出。油焖大虾的做法步骤7\n" +
                    "8锅内留底油，放入姜片、葱丝煸香。油焖大虾的做法步骤8\n" +
                    "9倒入调料汁。油焖大虾的做法步骤9\n" +
                    "10放入大虾，再倒入适量的料酒，盖上锅盖，焖烧至收汁（大约3分钟），加少许盐即可出锅。",

            "主料：鸡脯肉400g 黄瓜100g 熟花生100g\n" +
                    "辅料：油适量 盐适量 葱适量 料酒适量 生抽适量 花椒适量 醋适量 糖适量 水淀粉适量\n" +
                    "做法：宫保鸡丁的做法\n" +
                    "1原料宫保鸡丁的做法步骤1\n" +
                    "2黄瓜切丁、葱要切成小段，干辣椒剪去两头，去除辣椒籽宫保鸡丁的做法步骤2\n" +
                    "3鸡胸肉切丁，放生抽、盐、料酒码味，用水淀粉拌匀宫保鸡丁的做法步骤3\n" +
                    "4在小碗中调入酱油、盐、白砂糖和料酒，混合均匀制成调味料汁宫保鸡丁的做法步骤4\n" +
                    "5锅中留底油，烧热后将花椒和干辣椒放入，用小火煸炸出香味，随后放入大葱段宫保鸡丁的做法步骤5\n" +
                    "6放入鸡丁，放1汤匙料酒，炒到鸡肉变色宫保鸡丁的做法步骤6\n" +
                    "7最后调入料汁宫保鸡丁的做法步骤7\n" +
                    "8再放入黄瓜丁、熟花生米，翻炒均匀宫保鸡丁的做法步骤8\n" +
                    "9水淀粉勾芡，即可",

            "主料：三黄鸡2斤\n" +
                    "辅料：姜适量 盐适量 葱适量 蒜适量 辣椒适量 灯笼椒适量 花椒油适量 白糖适量 生抽适量 香醋适量 大料适量 豆豉适量 料酒适量\n" +
                    "做法：口水鸡的做法\n" +
                    "1三黄鸡杀死后处理好内脏，用水冲洗干净口水鸡的做法步骤1\n" +
                    "2放入锅里，加生姜，葱，料酒中火煮开至五分钟左右（这个时间视鸡的大小决定，如果稍大的鸡，就时间长一点）然后关火口水鸡的做法步骤2\n" +
                    "3盖上锅盖浸泡40-50分钟，这样做的原因是，中火烧开五分钟鸡肉基本断生了，浸泡是让鸡肉吸取所需的热量和水份，做到了让鸡肉吃起一不老不嫩口水鸡的做法步骤3\n" +
                    "4浸泡好鸡肉后捞出放入冷却的凉开水中过凉水保持鸡肉皮质细嫩紧滑。口水鸡的做法步骤4\n" +
                    "5接下来做辣椒红油，这道菜一定要有红油。 锅里放入少量油，三成油温的时候把辣椒，三萘，八角这些香料放进锅里炒口水鸡的做法步骤5\n" +
                    "6炒干水份变得干爽后捞出放凉口水鸡的做法步骤6\n" +
                    "7剁成末，也可以用搅拌机打成粉，不过我们习惯于剁成块状，这样做出来的辣椒油更香口水鸡的做法步骤7\n" +
                    "8剁好的辣椒末放一个耐高温的碗里，加入适量豆豉口水鸡的做法步骤8\n" +
                    "9锅里烧热油，油温先烧到冒青烟时关火，降温至8成热时，把油倒在进辣椒末里浸泡口水鸡的做法步骤9\n" +
                    "10这样初步的辣椒油算是做好了。（这里我用了两种干辣椒，如果只用子弹头这种辣椒，那做出来的辣椒油会很辣，增加一些灯笼椒进去，就会中和一下辣味，而变得很香）口水鸡的做法步骤10\n" +
                    "11辣椒油做好后，就该配口水鸡的调料了 姜，蒜用捣蒜器捣成泥口水鸡的做法步骤11\n" +
                    "12葱切成葱花口水鸡的做法步骤12\n" +
                    "13姜蒜泥放碗里，调入醋，生抽，白糖，等调料搅拌均匀口水鸡的做法步骤13\n" +
                    "14然后用筛过滤掉蒜姜的渣口水鸡的做法步骤14\n" +
                    "15把做好的辣椒油只取面上的红油混入调好的汁里，最后撒上芝麻，这个口水鸡的调料就做成了。（如果有花生，可以加点花生进去会更香）口水鸡的做法步骤15\n" +
                    "16肉切成大小合适的块，码放在碗里口水鸡的做法步骤16\n" +
                    "17淋上调好的辣椒红油，最后撒上葱花，这道大名鼎鼎的口水鸡就大功告成啦",

            "主料：五花肉400g 青蒜250g\n" +
                    "辅料：葱适量 姜适量 蒜适量 干红辣椒适量 花椒1勺 郫县豆瓣酱1大勺 料酒适量 糖适量 酱油适量\n" +
                    "做法：回锅肉的做法\n" +
                    "1带皮五花肉冷水下锅加入葱段、姜片花椒7、8粒，黄酒适量煮开回锅肉的做法步骤1\n" +
                    "2撇净浮沫，煮至八成熟，取出自然冷却。回锅肉的做法步骤2\n" +
                    "3将肉切成薄片，姜、蒜切片，葱切成斜段回锅肉的做法步骤3\n" +
                    "4将青蒜的白色部分先用刀拍一下，然后全部斜切成段备用回锅肉的做法步骤4\n" +
                    "5炒锅上火，加很少的油煸香辣椒、花椒及葱姜蒜回锅肉的做法步骤5\n" +
                    "6下入肉片煸炒，至肉片颜色变透明，边缘略微卷起回锅肉的做法步骤6\n" +
                    "7将肉拨到锅一边，下入郫县豆瓣酱（可以先剁细）炒出红油回锅肉的做法步骤7\n" +
                    "8适当的加入少许酱油或甜面酱调色，与肉片一起翻炒均匀回锅肉的做法步骤8\n" +
                    "9下入青蒜，点少许料酒，糖调好味道即可出锅。",

            "主料：大鸡腿肉350g\n" +
                    "辅料：淀粉适量 白芝麻10g 盐4g 白酒3ml 酱油10ml 料酒5ml 白糖5g 姜丝5g 葱段5g 花椒5g 干辣椒10g\n" +
                    "做法：辣子鸡丁的做法\n" +
                    "1鸡腿洗净，用刀沿着骨头切开，剔骨只留鸡肉。辣子鸡丁的做法步骤1\n" +
                    "2鸡腿肉切成1.5cm*1.5cm的鸡肉丁，加入酱油，葱绿段，姜丝2克，盐1ml，腌制15分钟。辣子鸡丁的做法步骤2\n" +
                    "3腌制好的鸡肉丁轻轻的滚一层干淀粉。辣子鸡丁的做法步骤3\n" +
                    "4用筛网轻轻筛掉粘在表面多余的干淀粉。辣子鸡丁的做法步骤4\n" +
                    "5锅里倒油烧至7成热，下入鸡肉丁炸至金黄色捞出备用。辣子鸡丁的做法步骤5\n" +
                    "6锅里留一点底油，放入姜丝3克，葱白段，花椒，干辣椒段炒出香味。辣子鸡丁的做法步骤6\n" +
                    "7倒入炸好的鸡肉丁，放入盐3克，糖5克，白酒，快速翻炒。辣子鸡丁的做法步骤7\n" +
                    "8撒入白芝麻快速翻炒即可出锅。",

            "主料：豆腐500g 猪肉40g\n" +
                    "辅料：油适量 生抽10ml 白糖1g 郫县豆瓣酱15g 豆豉酱10g 盐适量 水淀粉适量 葱适量 花椒粉2g 姜适量\n" +
                    "做法：麻婆豆腐的做法\n" +
                    "1准备好所有的食材。麻婆豆腐的做法步骤1\n" +
                    "2猪肉切碎。麻婆豆腐的做法步骤2\n" +
                    "3豆腐切块用淡盐水浸泡10分钟，沥干水分。麻婆豆腐的做法步骤3\n" +
                    "4葱姜切碎，郫县豆瓣酱剁细。麻婆豆腐的做法步骤4\n" +
                    "5炒锅到油爆香葱姜。麻婆豆腐的做法步骤5\n" +
                    "6倒入肉末翻炒变色。麻婆豆腐的做法步骤6\n" +
                    "7然后加入郫县豆瓣酱，和豆豉。麻婆豆腐的做法步骤7\n" +
                    "8翻炒出香味。麻婆豆腐的做法步骤8\n" +
                    "9加入豆腐。麻婆豆腐的做法步骤9\n" +
                    "10加入适量清水。麻婆豆腐的做法步骤10\n" +
                    "11加入生抽。麻婆豆腐的做法步骤11\n" +
                    "12加入白糖。麻婆豆腐的做法步骤12\n" +
                    "13豆腐烧制5分钟后加入花椒粉。麻婆豆腐的做法步骤13\n" +
                    "14淋入水淀粉勾芡。麻婆豆腐的做法步骤14\n" +
                    "15锅铲推动豆腐汤汁浓稠关火。",

            "主料：猪腰250g 青笋100g 木耳100g\n" +
                    "辅料：油适量 盐适量\n" +
                    "做法：泡椒腰花的做法\n" +
                    "1猪腰洗净，平切成两片，去除油皮和腰臊，先反刀斜切，再直刀切成三刀一断的眉毛形，焯水待用。 青笋斜刀切成薄片，木儿泡发撕小块;蒜瓣拍散，红泡椒剁碎，待用。泡椒腰花的做法步骤1\n" +
                    "2用中等火力加热油，然后放入葱花、姜片、蒜碎和红泡椒碎爆香，再将火力调至最大，随后迅速下入准备好的腰花，爆炒约1分钟，泡椒腰花的做法步骤2\n" +
                    "3然后放入准备好的调味汁和青笋片和木耳，泡椒腰花的做法步骤3\n" +
                    "4待汤汁收稠后装盘即可",

            "主料：猪里脊350g 白菜300g\n" +
                    "辅料：菜籽油适量 盐适量 鸡蛋清适量 淀粉适量 白糖适量 豆瓣酱适量 大蒜适量 味极鲜酱油适量 青花椒适量 红花椒适量 干红辣椒适量 香葱30g 小米椒30g\n" +
                    "做法：水煮肉片的做法\n" +
                    "1猪里脊肉一块，洗净备用。水煮肉片的做法步骤1\n" +
                    "2香葱和小米椒洗净备用。水煮肉片的做法步骤2\n" +
                    "3白菜适量，洗净备用。水煮肉片的做法步骤3\n" +
                    "4准备调料备用。水煮肉片的做法步骤4\n" +
                    "5猪里脊肉洗净，去筋皮，切薄片。水煮肉片的做法步骤5\n" +
                    "6将切好的肉片放入大碗中，加入少许食盐、淀粉和蛋清。水煮肉片的做法步骤6\n" +
                    "7将肉片均匀裹上淀粉，静置10分钟入味。水煮肉片的做法步骤7\n" +
                    "8白菜将叶子手撕大片，白菜帮切丝备用。水煮肉片的做法步骤8\n" +
                    "9将豆瓣酱、大蒜剁碎，辣椒剪段备用。水煮肉片的做法步骤9\n" +
                    "10香葱和小米椒切小粒备用。水煮肉片的做法步骤10\n" +
                    "11炒锅放入菜籽油，下入花椒和辣椒段炸香。水煮肉片的做法步骤11\n" +
                    "12花椒和辣椒炸成棕红色后，捞出备用。水煮肉片的做法步骤12\n" +
                    "13将炸好的花椒和辣椒段剁碎末备用。水煮肉片的做法步骤13\n" +
                    "14将白菜丝放入炸好的花椒油锅里翻炒。水煮肉片的做法步骤14\n" +
                    "15加入少许食盐和五香粉，翻炒入味。水煮肉片的做法步骤15\n" +
                    "16下入白菜叶翻炒。水煮肉片的做法步骤16\n" +
                    "17炒至白菜叶变软。水煮肉片的做法步骤17\n" +
                    "18将白菜放入装菜的容器中。水煮肉片的做法步骤18\n" +
                    "19炒锅放油，下入剁好的豆瓣酱煸炒出红油。水煮肉片的做法步骤19\n" +
                    "20加入适量清水，放入白糖，综合味道。水煮肉片的做法步骤20\n" +
                    "21水煮开后，将腌制好的肉片，逐片下入锅中。水煮肉片的做法步骤21\n" +
                    "22煮至肉片变白。水煮肉片的做法步骤22\n" +
                    "23将煮好的肉片倒入装白菜的容器里。水煮肉片的做法步骤23\n" +
                    "24将剁碎的花椒辣椒碎、小米椒、大蒜和香葱撒在肉片上。水煮肉片的做法步骤24\n" +
                    "25取锅烧热油，浇在撒入的香葱碎上。水煮肉片的做法步骤25\n" +
                    "26一碗椒香四溢的水煮肉片即制作完成。",

            "主料：草鱼1000g 黄豆芽500g 蛋清2个\n" +
                    "辅料：豆瓣酱2大勺 花椒50g 麻椒50g 干红辣椒100g 葱2棵 姜1小块 蒜半朵 食盐适量 淀粉少许 菜籽油适量 大茴4个 料酒适量\n" +
                    "做法：水煮鱼的做法\n" +
                    "1草鱼一条，去鳞去内脏清洗干净备用。水煮鱼的做法步骤1\n" +
                    "2去头取尾和中间的鳍。水煮鱼的做法步骤2\n" +
                    "3将鱼直立起来，用刀在背部划开，方便取鱼肉。水煮鱼的做法步骤3\n" +
                    "4将鱼肉和鱼骨分离。水煮鱼的做法步骤4\n" +
                    "5用刀逐片将鱼肉片成薄薄的鱼片。水煮鱼的做法步骤5\n" +
                    "6鱼骨斩块备用。水煮鱼的做法步骤6\n" +
                    "7鱼头对开备用。水煮鱼的做法步骤7\n" +
                    "8准备大蒜、麻椒、花椒、大茴和各类干红辣椒。水煮鱼的做法步骤8\n" +
                    "9葱打结备用。水煮鱼的做法步骤9\n" +
                    "10黄豆芽洗净备用。水煮鱼的做法步骤10\n" +
                    "11鱼片加入少许料酒、食盐、一个蛋清和少许淀粉，拌匀腌制起来备用。水煮鱼的做法步骤11\n" +
                    "12鱼骨和鱼头也加入料酒、蛋清一个和淀粉拌匀备用。水煮鱼的做法步骤12\n" +
                    "13炒锅放油，将黄豆芽炒至断生，加入少许盐。水煮鱼的做法步骤13\n" +
                    "14将炒好的黄豆芽放入容器内备用。水煮鱼的做法步骤14\n" +
                    "15炒锅放油，加入大茴、花椒和麻椒炸香。水煮鱼的做法步骤15\n" +
                    "16将炸好的花椒和麻椒捞出一大半备用。水煮鱼的做法步骤16\n" +
                    "17放入干红辣椒炸香。水煮鱼的做法步骤17\n" +
                    "18放入豆瓣酱，炒出红油。水煮鱼的做法步骤18\n" +
                    "19加入肉汤或者清水，同时放入打好的葱结。水煮鱼的做法步骤19\n" +
                    "20放入鱼头和鱼骨烧开。水煮鱼的做法步骤20\n" +
                    "21这个时间，将是蒜剁碎备用，将刚刚炸香的花椒擀碎。水煮鱼的做法步骤21\n" +
                    "22水开后，用筷子逐片将鱼片下锅。水煮鱼的做法步骤22\n" +
                    "23将煮好的鱼片倒入装黄豆芽的容器中，上面撒上蒜蓉和花椒碎。水煮鱼的做法步骤23\n" +
                    "24另取一锅，加入食用油，放入干红辣椒，将辣椒炸出香味后关火。水煮鱼的做法步骤24\n" +
                    "25将烧好的热油和辣椒倒入蒜碎和花椒碎上，即可食用。",

            "主料：草鱼1200g 四川酸菜400g\n" +
                    "辅料：葱段适量 姜片适量 大蒜适量 干红辣椒适量 花椒适量 野山椒适量 红泡椒适量 香菜适量 料酒适量 胡椒粉适量 水淀粉适量 蛋清适量 盐适量 糖适量 鸡精适量 香葱适量 麻椒适量\n" +
                    "做法：酸菜鱼的做法\n" +
                    "1新鲜草鱼一尾，宰杀清洗干净； 四川酸菜冲洗一下切成小段酸菜鱼的做法步骤1\n" +
                    "2如图：将鱼去头，剔骨，取下两面净鱼肉；鱼头从中间片开酸菜鱼的做法步骤2\n" +
                    "3将鱼骨剁成2cm的段，鱼肉顺着鱼尾方向斜刀片成连刀的蝴蝶片状酸菜鱼的做法步骤3\n" +
                    "4将片好的鱼片放入大碗中，加入少许盐、胡椒粉、料酒、蛋清（很少的）、水淀粉抓匀码味酸菜鱼的做法步骤4\n" +
                    "5锅烧热，加油，如花椒，干红辣椒 ，爆香葱姜蒜，再加入野山椒和红泡椒，煸炒出香味酸菜鱼的做法步骤5\n" +
                    "6下入四川酸菜煸炒，加入少许料酒，糖，添加足量的水酸菜鱼的做法步骤6\n" +
                    "7将鱼头及鱼骨下入，大火烧开，撇去浮沫，煮约10分钟，加入鸡精。酸菜鱼的做法步骤7\n" +
                    "8调成微火后将鱼片一片片下入锅中，开中火再次沸腾、见鱼片变白即可倒入盆中，表面撒上香葱段和小香葱段酸菜鱼的做法步骤8\n" +
                    "9炒锅中加入适量的油，温油加入干红辣椒、蒜片、花椒麻椒，炸至干红辣椒变酥脆后，趁热倒在做好的酸菜鱼表面即可酸菜鱼的做法步骤9\n" +
                    "10油的多少自己调节",

            "主料：茄子2个 青椒1个 红椒1个\n" +
                    "辅料：油适量 盐适量 四川泡辣椒碎10g 酱油15g 醋10g 料酒10g 白糖20g 葱10g 姜10g 蒜2瓣 湿淀粉10g\n" +
                    "做法：鱼香茄子的做法\n" +
                    "1原料鱼香茄子的做法步骤1\n" +
                    "2调料鱼香茄子的做法步骤2\n" +
                    "3茄子切片，放少许盐拌匀，茄子腌制0分钟左右，挤出水份鱼香茄子的做法步骤3\n" +
                    "4青、红椒切丁鱼香茄子的做法步骤4\n" +
                    "5锅中放油，茄子过油炸，捞出鱼香茄子的做法步骤5\n" +
                    "6锅中留底油，下 葱、蒜、姜末炒香，再放入泡辣椒碎炒出香味后鱼香茄子的做法步骤6\n" +
                    "7放入茄子鱼香茄子的做法步骤7\n" +
                    "8翻炒均匀后，调入鱼香汁鱼香茄子的做法步骤8\n" +
                    "9炒至茄子入味后，放入青、红椒丁，翻炒均匀后出锅",

            "主料：猪里脊400g 尖椒50g 冬笋80g 胡萝卜80g 木耳80g 红泡椒2汤勺\n" +
                    "辅料：醋1汤勺 生抽1汤勺 料酒适量 糖2勺 盐适量 胡椒粉适量 蛋清适量 水淀粉适量 葱适量 蒜末适量 姜适量\n" +
                    "做法：鱼香肉丝的做法\n" +
                    "1将泡发的木耳、尖椒、胡萝卜、冬笋切成丝；葱姜蒜切末鱼香肉丝的做法步骤1\n" +
                    "2将里脊切成丝，提前用料酒、胡椒粉、少许盐、水淀粉、蛋清腌制，并加入一勺油抓匀上浆。鱼香肉丝的做法步骤2\n" +
                    "3醋1大勺、酱油1大勺、白糖2勺 、加淀粉、盐、鸡精、少许水及姜末、蒜末调成碗汁，备用鱼香肉丝的做法步骤3\n" +
                    "4锅烧热，放少量油后，将肉丝滑散，变色即盛出；鱼香肉丝的做法步骤4\n" +
                    "5在将配菜滑炒一下，盛出备用鱼香肉丝的做法步骤5\n" +
                    "6锅中留少许底油，爆香葱姜蒜末，加入2勺红泡椒炒出香味和红油鱼香肉丝的做法步骤6\n" +
                    "7下入肉丝快速翻炒鱼香肉丝的做法步骤7\n" +
                    "8立即加入其余配菜，翻炒几下后烹入调好的碗汁，快速翻炒均匀，即可起锅。",

            "主料：牛油1500g 郫县豆瓣1000g 菜籽油1000g 干辣椒1000g 干花椒100g 碎米芽菜100g 醪糟100g 泡椒200g 豆豉100g 白酒50g\n" +
                    "辅料：小茴香8g 孜然8g 香果5g 砂仁5g 丁香5g 白扣5g 草果5g 三奈5g 香草5g 千里香5g 香叶5g 桂皮5g 八角5g 陈皮5g 老扣5g 香茅草5g 甘松5g 甘草5g 枝子5g 排草5g\n" +
                    "做法：秘制四川麻辣火锅底料的做法\n" +
                    "1将所有香料准备好，比较长的剪成小段秘制四川麻辣火锅底料的做法步骤1\n" +
                    "2将香料清洗干净，用水泡20分钟秘制四川麻辣火锅底料的做法步骤2\n" +
                    "3辣椒和花椒清洗干净，用水稍微泡一泡，然后控去多余水分秘制四川麻辣火锅底料的做法步骤3\n" +
                    "4泡好的香料控去多余水分，用料理机打成木屑状秘制四川麻辣火锅底料的做法步骤4\n" +
                    "5辣椒也放入料理机里打碎，不用太细秘制四川麻辣火锅底料的做法步骤5\n" +
                    "6碎米芽菜、豆豉、豆瓣酱，放入料理机里打细秘制四川麻辣火锅底料的做法步骤6\n" +
                    "7锅里倒入菜籽油，冷油下入香料，中小火慢慢熬十几分钟，熬出香味秘制四川麻辣火锅底料的做法步骤7\n" +
                    "8另起锅将牛油熬出油来，去掉油渣秘制四川麻辣火锅底料的做法步骤8\n" +
                    "9将熬好的香料锅里的油过滤到牛油锅里秘制四川麻辣火锅底料的做法步骤9\n" +
                    "10加入打细的碎米芽菜、豆豉、豆瓣酱、辣椒、花椒，中火熬十来分钟秘制四川麻辣火锅底料的做法步骤10\n" +
                    "11加入过滤出来的香料，中火熬10几分钟秘制四川麻辣火锅底料的做法步骤11\n" +
                    "12加入白酒、醪糟、泡椒，再熬十来分钟秘制四川麻辣火锅底料的做法步骤12\n" +
                    "13火锅底料熬好了",

            "主料：菜心300g\n" +
                    "辅料：油3g 盐2g 蚝油5g 生抽5g 清水30g 姜5g 蒜5g\n" +
                    "做法：白灼菜心的做法\n" +
                    "1主要食材，菜心白灼菜心的做法步骤1\n" +
                    "2剥去靠近根部的老叶黄叶或残缺有虫眼的叶子白灼菜心的做法步骤2\n" +
                    "3用剪刀或刀切去根部带白心部分白灼菜心的做法步骤3\n" +
                    "4若菜心内有黄色菜花，将花剪去白灼菜心的做法步骤4\n" +
                    "5流水下冲洗根部和每片叶子底部缝隙白灼菜心的做法步骤5\n" +
                    "6冲洗好后用清水浸泡10分钟白灼菜心的做法步骤6\n" +
                    "7调味汁原料白灼菜心的做法步骤7\n" +
                    "8蒜籽用刀背拍松，便于剥皮白灼菜心的做法步骤8\n" +
                    "9剥皮后切成蒜丁白灼菜心的做法步骤9\n" +
                    "10姜去皮后切片再切细丝白灼菜心的做法步骤10\n" +
                    "11灼菜心步骤： 锅内倒入适量清水，再倒几滴油白灼菜心的做法步骤11\n" +
                    "12加少许盐，大火煮白灼菜心的做法步骤12\n" +
                    "13待水煮沸时白灼菜心的做法步骤13\n" +
                    "14将菜心放入水中，不盖锅盖继续煮至水再次沸腾白灼菜心的做法步骤14\n" +
                    "15捞起用凉开水略浸再沥干白灼菜心的做法步骤15\n" +
                    "16整齐码入碟内白灼菜心的做法步骤16\n" +
                    "17锅内倒少许油白灼菜心的做法步骤17\n" +
                    "18倒入姜丝和蒜丁白灼菜心的做法步骤18\n" +
                    "19加少许盐，翻炒至有香味白灼菜心的做法步骤19\n" +
                    "20加1勺蚝油白灼菜心的做法步骤20\n" +
                    "21再加1勺生抽白灼菜心的做法步骤21\n" +
                    "22加适量清水白灼菜心的做法步骤22\n" +
                    "23待汤汁煮沸可关火白灼菜心的做法步骤23\n" +
                    "24沥出姜丝和蒜丁白灼菜心的做法步骤24\n" +
                    "25将调味汁淋在菜心上即可",
            "主料：鸡肉300g\n" +
                    "辅料：姜丝1块 蒜米3粒 花生油50g 酱油50ml 香油10ml 盐0.5勺\n" +
                    "做法：豉油鸡的做法\n" +
                    "1鸡肉洗净放盘内备用。豉油鸡的做法步骤1\n" +
                    "2姜切丝，蒜切末备用。豉油鸡的做法步骤2\n" +
                    "3锅内倒入适量花生油。豉油鸡的做法步骤3\n" +
                    "4再倒入同等量的酱油。豉油鸡的做法步骤4\n" +
                    "5倒入少许香油。豉油鸡的做法步骤5\n" +
                    "6加少许盐。豉油鸡的做法步骤6\n" +
                    "7把锅内的料调和均匀。豉油鸡的做法步骤7\n" +
                    "8把鸡肉放入锅内使每块鸡肉上都沾上酱汁。豉油鸡的做法步骤8\n" +
                    "9盖上锅内中火煮。豉油鸡的做法步骤9\n" +
                    "10待开锅冒气10秒后改小火打开锅盖翻动一下每块鸡，再盖上锅盖煮一分钟再翻，用同样的方法直到鸡肉熟。豉油鸡的做法步骤10\n" +
                    "11加入蒜米和姜丝，再焖煮2分钟。豉油鸡的做法步骤11\n" +
                    "12把鸡肉斩块，锅内酱汁倒在鸡肉上即可。",

            "主料：排骨500g\n" +
                    "辅料：油适量 盐适量 橙子适量 白糖适量 生抽适量 芝麻适量 葱适量 姜适量\n" +
                    "做法：橙汁排骨的做法\n" +
                    "1排骨事先浸泡掉血水。 锅子烧水，将猪肋排放入，煮半小时左右，将排骨煮熟。橙汁排骨的做法步骤1\n" +
                    "2橙子榨汁。橙汁排骨的做法步骤2\n" +
                    "3锅子烧热，倒油，放入白糖煸炒至糖化开，成金黄色.橙汁排骨的做法步骤3\n" +
                    "4倒入排骨，煸炒上色。橙汁排骨的做法步骤4\n" +
                    "5倒入橙汁。橙汁排骨的做法步骤5\n" +
                    "6加入葱姜、八角。橙汁排骨的做法步骤6\n" +
                    "7加入盐。橙汁排骨的做法步骤7\n" +
                    "8加入生抽。（我放的老抽，所以颜色重了点）橙汁排骨的做法步骤8\n" +
                    "9炖至汤汁浓稠，加入少许白芝麻点缀，出锅装盘即可。",
            "主料：鸡蛋1个 火腿1片\n" +
                    "辅料：食用油少许 盐适量 鸡精少许 胡椒粉少许 葱花少许 熟花生碎适量 大米粥适量\n" +
                    "做法：火腿蛋丝粥的做法\n" +
                    "1准备所需材料。火腿蛋丝粥的做法步骤1\n" +
                    "2鸡蛋加入少许盐打散。火腿蛋丝粥的做法步骤2\n" +
                    "3平底锅加入少许油烧热，然后倒入鸡蛋液。火腿蛋丝粥的做法步骤3\n" +
                    "4把鸡蛋摊熟后，切成丝。火腿蛋丝粥的做法步骤4\n" +
                    "5将火腿切成丝，入锅内煸炒一下盛出备用。火腿蛋丝粥的做法步骤5\n" +
                    "6大米粥倒入锅内煮开。火腿蛋丝粥的做法步骤6\n" +
                    "7然后加入鸡蛋丝和火腿丝。火腿蛋丝粥的做法步骤7\n" +
                    "8煮开后，加入适量的盐和鸡精。火腿蛋丝粥的做法步骤8\n" +
                    "9最后煮至盐溶化后装碗，装碗后再撒上花生碎、胡椒粉和葱花即可食用。",
            "主料：猪里脊肉400g 菠萝200g\n" +
                    "辅料：鸡蛋适量 淀粉适量 盐适量 番茄酱适量 白醋适量 白糖适量 绍酒适量 水适量 青椒适量 红椒适量\n" +
                    "做法：菠萝咕老肉的做法\n" +
                    "1猪里脊买回来，洗净，自中间剖开。菠萝咕老肉的做法步骤1\n" +
                    "2刀子与桌面呈45度角，斜着切，然后反过来，刀子与桌子垂直，切网格状。可以帮助入味。菠萝咕老肉的做法步骤2\n" +
                    "3切成方块。将猪肉块里面放入盐、胡椒粉、鸡精、绍酒，搅拌均匀，腌半小时。菠萝咕老肉的做法步骤3\n" +
                    "4打入一个鸡蛋，搅拌均匀，使肉上裹上蛋液。菠萝咕老肉的做法步骤4\n" +
                    "5把肉块上面均匀裹上淀粉。菠萝咕老肉的做法步骤5\n" +
                    "6油锅烧至7成热，放入猪肉块，炸至金黄色，捞出控干油。菠萝咕老肉的做法步骤6\n" +
                    "7青红椒切成菱形块，菠萝切块（罐头捞出，控干）。菠萝咕老肉的做法步骤7\n" +
                    "8倒入两大匙番茄酱，三大匙白砂糖（如果是罐头，可以减少成2匙或者是一匙半），两勺白醋、两勺绍酒，盐少许，少许清水，调成酱汁。菠萝咕老肉的做法步骤8\n" +
                    "9将酱汁倒入锅内，熬至粘稠。菠萝咕老肉的做法步骤9\n" +
                    "10倒入炸好的肉块，青红椒、菠萝块。 均匀裹上酱汁即可出锅。",
            "主料：小麦面粉200g 鸡蛋2个 鲜虾云呑20只\n" +
                    "辅料：油适量 盐适量 蒜黄适量 生抽适量 高汤1碗\n" +
                    "做法：鲜虾云呑面的做法\n" +
                    "1200克面粉中加入2个鸡蛋和1克盐。鲜虾云呑面的做法步骤1\n" +
                    "2和成团醒10分钟。鲜虾云呑面的做法步骤2\n" +
                    "310分钟后再来揉，再醒40分钟。鲜虾云呑面的做法步骤3\n" +
                    "440分钟后再来揉，再醒40分钟。鲜虾云呑面的做法步骤4\n" +
                    "540分钟后将面揉成条，压扁。鲜虾云呑面的做法步骤5\n" +
                    "6用机器先压片，再切割成细细的面条。鲜虾云呑面的做法步骤6\n" +
                    "7将面条下入沸水锅中，锅开，面就煮熟了。鲜虾云呑面的做法步骤7\n" +
                    "8同时在另一锅中将鲜虾云呑入沸水锅中，锅开，点一次水，水再开，云呑就好了，这时云呑全部是漂上来了。鲜虾云呑的做法请看：http://www.haodou.com/recipe/447498鲜虾云呑面的做法步骤8\n" +
                    "9将面和云呑盛入大碗中加点盐、生抽调味，舀上高汤，上面再些蒜黄苗。正宗的是用韭黄。",
            "主料：猪肉2000g\n" +
                    "辅料：大蒜瓣10瓣 市售叉烧酱240g 生抽4勺 料酒1勺 蜂蜜2勺\n" +
                    "做法：叉烧肉的做法\n" +
                    "1将猪肉分割洗净，清水浸泡1小时然后，沥干控掉水分。叉烧肉的做法步骤1\n" +
                    "2【辅材】所有材料混合在一起，充分拌匀。叉烧肉的做法步骤2\n" +
                    "3将猪肉挨个放入腌料中，裹沾均匀。叉烧肉的做法步骤3\n" +
                    "4裹沾上腌料的猪肉放入盆中，剩余的腌料倒入盆中盖上保鲜膜，放入冰箱冷藏2天。叉烧肉的做法步骤4\n" +
                    "5腌制好的猪肉放烤网上，烤网下电烤盘铺好锡纸，刷上腌料汁，放入烤箱中层。叉烧肉的做法步骤5\n" +
                    "6烤箱以200°烤20分钟，取出刷上腌料汁翻面，继续烤20分钟，再取出刷上腌料汁。叉烧肉的做法步骤6\n" +
                    "7来回反复共烤制1小时出炉。叉烧肉的做法步骤7\n" +
                    "8晾到不烫手，切片即可享用。",
            "主料：基围虾300g\n" +
                    "辅料：油适量 盐适量 葱20g 姜10g 花椒10粒 八角1个 料酒2勺 柠檬片2片\n" +
                    "做法：白灼虾的做法\n" +
                    "1将虾去除虾线、虾须，清洗干净。白灼虾的做法步骤1\n" +
                    "2准备所需的配料：蒸鱼豉油、料酒、葱、姜、八角、花椒、柠檬片。白灼虾的做法步骤2\n" +
                    "3蒸鱼豉油加姜丝、葱片（此处用去一半的姜，少量葱），浸泡一段时间（先准备好，做蘸汁用）。白灼虾的做法步骤3\n" +
                    "4锅中加适量水，放入葱段、姜片、柠檬片，加两勺料酒。白灼虾的做法步骤4\n" +
                    "5煮开后倒入虾。白灼虾的做法步骤5\n" +
                    "6再次烧开后，煮大约半分钟即可关火。白灼虾的做法步骤6\n" +
                    "7将虾捞出放入冰水中过凉，再捞出控干。白灼虾的做法步骤7\n" +
                    "8锅中加适量油，放入八角、花椒、葱段爆香。白灼虾的做法步骤8\n" +
                    "9将热油倒入盛放料汁的碗中。白灼虾的做法步骤9\n" +
                    "10做好的料汁，可以滤去调料。白灼虾的做法步骤10\n" +
                    "11虾搭配料汁摆盘，可以开吃啦。",

            "主料：纯牛奶200ml 老姜1块\n" +
                    "辅料：细砂糖适量\n" +
                    "做法：姜撞奶的做法\n" +
                    "1准备所需材料。姜撞奶的做法步骤1\n" +
                    "2老姜去皮切成小块，放入料理杯中搅碎。姜撞奶的做法步骤2\n" +
                    "3然后用干净的纱布包起来，再捏出姜汁。姜撞奶的做法步骤3\n" +
                    "4纯牛奶倒入奶锅内，加入适量的白砂糖。姜撞奶的做法步骤4\n" +
                    "5再坐炉子上煮至80-90度，如果没温度计的，煮至小锅边上起小泡即可。姜撞奶的做法步骤5\n" +
                    "6然后将牛奶快速倒入装有姜汁的碗内。姜撞奶的做法步骤6\n" +
                    "7然后静至几分钟，不要搅拌它，让它凝结即可。",

            "主料：鲜鸡1200g \n" +
                    "辅料：姜片适量 葱花适量\n" +
                    "做法：白切鸡的做法\n" +
                    "1新鲜鸡洗干净白切鸡的做法步骤1\n" +
                    "2锅里加入清水和姜片一起煮开白切鸡的做法步骤2\n" +
                    "3水开后把鲜鸡放入锅中，水一定要能把整只鸡浸泡，水不能太少，把整只鸡放入锅中后，再用筷子夹起倒出鸡肚里面的水，再重新放入锅中白切鸡的做法步骤3\n" +
                    "4大火煮5分钟白切鸡的做法步骤4\n" +
                    "5期间要用筷子翻动整只鸡，白切鸡的做法步骤5\n" +
                    "6翻动鲜鸡，确保每一面都受热均匀白切鸡的做法步骤6\n" +
                    "75分钟后关火，盖上锅盖，焖10分钟白切鸡的做法步骤7\n" +
                    "810分钟后打开盖子白切鸡的做法步骤8\n" +
                    "9准备一盘冰水再加入冰块白切鸡的做法步骤9\n" +
                    "10捞起鸡把鸡浸泡在冰水里，再加上冰块，这样浸泡15-20分钟白切鸡的做法步骤10\n" +
                    "11准备酱料，把姜片切成姜蓉，加入生抽、一点葱花白切鸡的做法步骤11\n" +
                    "12用过烧热油，把烧热的油倒在生抽姜蓉里面即可白切鸡的做法步骤12\n" +
                    "13做好的酱料，喜欢生抽的味道就加生抽，如果不喜欢生抽的，可以在姜蓉里加入盐，再淋上热油就可以了白切鸡的做法步骤13\n" +
                    "14泡好冰水的鸡白切鸡的做法步骤14\n" +
                    "15切开斩件白切鸡的做法步骤15\n" +
                    "16美味的白切鸡就完成了",





    };

    public static List<FoodBean> getAllFoodList(){
        List<FoodBean>list = new ArrayList<>();
        for (int i = 0; i < food.length; i++) {
            FoodBean bean = new FoodBean(food[i],jianjie[i],foodneirong[i],resId[i]);
            list.add(bean);
        }
        return list;
    }
}
