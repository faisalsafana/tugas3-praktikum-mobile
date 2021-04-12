package com.example.recyclerview;

import java.util.ArrayList;

public class DataGunung {
    private static String[] title = new String[]{"Gunung Everest", "Gunung K2","Kangchenjunga", "Lhotse","Makalu","Cho Oyu","Dhaulagiri","Manaslu","Nanga Parbat","Annapurna"};

    private static int[] thumbnail = new
            int[]{R.drawable.everest, R.drawable.k2, R.drawable.kanchenjunga, R.drawable.lhotse, R.drawable.makalu,R.drawable.chooyu,R.drawable.dhaulagiri,R.drawable.manaslu,R.drawable.nanga,R.drawable.annapurna};


    private static String[] preview = new String[]{
            "Gunung ini mempunyai ketinggian sekitar 8.850 m; walaupun terdapat variasi dari segi ukuran (baik pemerintah Nepal maupun Tiongkok belum mengesahkan ukuran ini secara resmi, ketinggian Puncak Everest masih dianggap 8.848 m oleh mereka). Gunung Everest pertama kali diukur pada tahun 1856 mempunyai ketinggian 8.839 m, tetapi dinyatakan sebagai 8.840 m (29.002 kaki). Tambahan 0,6 m (2 kaki) menunjukkan bahwa pada masa itu ketinggian yang tepat sebesar 29.000 kaki akan dianggap sebagai perkiraan yang dibulatkan. Perkiraan umum yang digunakan pada saat ini adalah 8.850 m yang diperoleh melalui bacaan Sistem Posisi Global (GPS). Gunung Himalaya masih terus bertambah tinggi akibat pergerakan lempeng tektonik kawasan tersebut.\n" +
                    "\n" +
                    "Gunung Everest adalah gunung yang puncaknya mencapai jarak paling jauh dari paras laut. Dua gunung lain yang kadang kala juga disebut sebagai \"gunung tertinggi di dunia\" adalah Mauna Loa di Hawaii, yang tertinggi jika diukur dari dasarnya pada dasar tengah laut, tetapi hanya mencapai ketinggian 4.170 m atas paras laut dan Gunung Chimborazo di Ekuador, yang puncaknya 2.150 m lebih tinggi dari pusat bumi dibandingkan Gunung Everest, karena Bumi mengembung di kawasan khatulistiwa. Bagaimanapun juga, Chimborazo hanya mencapai ketinggian 6.272 m di atas paras laut, sehingga bahkan bukan merupakan puncak tertinggi di Andes.",
            "K2 (bahasa Urdu: کے ٹو ) adalah gunung tertinggi ke-2 di dunia. Terletak di perbatasan antara Pakistan dan Republik Rakyat Tiongkok di wilayah Gilgit–Baltistan di utara Pakistan, dan di wilayah otonomi Tajik Taskhurgan di Xinjiang, Tiongkok. Tinggi Gunung ini mencapai 8,611 meter (28,251 kaki). K2 adalah puncak tertinggi di pegunungan Karakoram dan juga di Pakistan dan Xinjiang.\n" +
                    "\n" +
                    "Konon, Gunung ini lebih sulit didaki daripada Gunung Everest karena cuacanya yang buruk. K2 juga lebih tinggi di daerah sekitarnya bila dibandingkan ke Everest. K2 dijuluki sebagai \"Gunung Biadab\" karena hal ini. Sampai sekarang ada sekitar 300 pendakian yang sukses mencapai puncak dan ada 77 korban jiwa.[2] Mendaki melalui sisi Tiongkok lebih sulit dan berbahaya, maka para pendaki biasanya menaiki gunung melalui sisi Pakistan.\n" +
                    "\n" +
                    "Nama tak resmi untuk K2 ialah Gunung Godwin Austen, dinamai dari nama orang yang pertama kali memanjatnya. Selain itu pegunungan ini juga dinamai Qogir (diturukan dari Chogori), Lamba Pahar, Dapsang, Kechu, Ketu, dll.",
            "Kangchenjunga (Nepali:कञ्चनजङ्घा Kanchanjaŋghā) SewaLungma (Limbu) adalah gunung tertinggi ke-3 di dunia setelah Gunung Everest dan Chogori) dengan ketinggian 8.586 meter (28.169 kaki). Gunung ini juga adalah gunung tertinggi ke-2 di Nepal. Kangchenjunga berarti \"Lima Harta Karun Salju, karena ia terdiri dari 5 puncak, empat diantaranya mencapai lebih dari 8.450 meter. Harta karun itu melambangkan 5 benda milik dewa yaitu emas, perak, permata, biji-bijian dan kitab suci. Kangchenjunga disebut Sewalungma dalam bahasa Limbu dan disucikan dalam tradisi agama Kirant. Tiga dari 5 puncaknya (utama, tengah, dan selatan) membatasi wilayah Sikkim Utara dari distrik Sikkim, India dan Distrik Taplejung di Nepal, dan 2 yang lain berada di Distrik Taplejung. Selain itu wilayah ini juga dijadikan Kangchenjunga Conservation Area Project oleh World Wildlife Fund [2] [3] [4] [5] Diarsipkan 2008-05-12 di Wayback Machine. [6], yang melindungi satwa Panda Merah, burung, dan tanaman khas Nepal. Bagian India juga memiliki wilayah yang dilindungi dalam Taman Nasional Khangchendzonga.",
            "Lhotse (Nepal: ल्होत्से) merupakan sebuah gunung di Nepal dan RRC. Gunung ini terletak di bagian utara di negara itu. Gunung ini memiliki ketinggian 8.516 m (27.940 kaki) dan merupakan gunung terbesar keempat di dunia dan merupakan salah satu puncak yang membentuk kelompok dari Gunung Everest.\n" +
                    "\n" +
                    "Orang yang mendaki di gunung tersebut ialah Fritz Luschinger dan Ernst Reiss pada 18 Mei 1956. Pada 25 Desember 1974, pendaki asal Polandia, Andrzej Zawada dan Andrzej Heinrich melakukan pendakian hingga 8250 m (27066 ft 11 in) pada musim dingin. Pada tahun 1979, berlangsung pendakian puncak utama oleh Andrzej Czok dan Jerzy Kukuczka tanpa menggunakan oksigen tambahan.",
            "Makalu (Chinese: 馬卡魯峰; Nepali: मकालु हिमाल) is the fifth highest mountain in the world at 8,485 metres (27,838 ft). It is located in the Mahalangur Himalayas 19 km (12 mi) southeast of Mount Everest, on the border between Nepal and Tibet Autonomous Region, China. One of the eight-thousanders, Makalu is an isolated peak whose shape is a four-sided pyramid.\n" +
                    "\n" +
                    "Makalu has two notable subsidiary peaks. Kangchungtse, or Makalu II (7,678 m) lies about 3 kilometres (1.9 mi) north-northwest of the main summit. Rising about 5 km (3.1 mi) north-northeast of the main summit across a broad plateau, and connected to Kangchungtse by a narrow, 7,200 m saddle, is Chomo Lonzo (7,804 m)",
            "Cho Oyu (Nepal: चोयु; Tibet: ཇོ་བོ་དབུ་ཡ) adalah gunung tertinggi keenam di dunia dengan ketinggian 8188 meter (26.864 kaki) di atas permukaan laut. Dalam rumpun bahasa Tibet Cho Oyu berarti \"Dewi Pirus\".[2] Gunung ini adalah puncak utama paling barat dari subbagian Khumbu (Wilayah Everest) di Mahalangur Himalaya, 20 km sebelah barat Gunung Everest. Lokasi Cho Oyu berbatasan langsung dengan Tiongkok-Nepal.\n" +
                    "\n" +
                    "Dalam beberapa kilometer di sebelah barat Cho Oyu terdapat Nangpa La (5.716 meter/18.753 kaki), sebuah lintasan glasial yang berfungsi sebagai jalur perdagangan utama antara Tibet dan Suku Sherpa Khumbu. Jalur ini memisahkan antara Khumbu dan Rolwaling Himalaya. Karena kedekatannya dengan lintasan ini dan lereng yang umumnya mudah diakses dari jalur penggunungan barat laut, Cho Oyu dianggap puncak dengan ketinggian 8.000 meter paling mudah untuk didaki.[3] Cho Oyu juga tujuan populer bagi para pendaki.",
            "The Dhaulagiri massif in Nepal extends 120 km (70 mi) from the Kaligandaki River west to the Bheri. This massif is bounded on the north and southwest by tributaries of the Bheri River and on the southeast by the Myagdi Khola. Dhaulagiri is the seventh highest mountain in the world at 8,167 metres (26,795 ft) above sea level, and the highest mountain within the borders of a single country (Nepal). It was first climbed on 13 May 1960 by a Swiss/Austrian/Nepali expedition.\n" +
                    "\n" +
                    "धौलागिरी (dhaulāgirī) is the Nepali name for the mountain which comes from Sanskrit where धवल (dhawala) means dazzling, white, beautiful[3] and गिरि (giri) means mountain.[4] Dhaulagiri I is also the highest point of the Gandaki river basin.\n" +
                    "\n" +
                    "Annapurna I (8,091 m (26,545 ft)) is 34 km (21 mi) east of Dhaulagiri. The Kali Gandaki River flows between the two in the Kaligandaki Gorge, said to be the world's deepest.[citation needed] The town of Pokhara is south of the Annapurnas, an important regional center and the gateway for climbers and trekkers visiting both ranges as well as a tourist destination in its own right.",
            "Manaslu (मनास्लु, juga disebut sebagai Kutang) adalah gunung tertinggi ke-8 di dunia, terletak di Mansiri Himal, bagian dari pegunungan Himalaya, Nepal. Kata Manaslu berasal dari kata bahasa Sanskerta, Manasa dan diterjemahkan sebagai \"Gunung Jiwa\". Manaslu adalah puncak tertinggi di Gurkha dan terletak sekitar empat puluh mil sebelah timur Annapurna, gunung tertinggi ke-10. Gunung ini pertama kali didaki oleh 9 Mei 1956 oleh Toshio Imanishi dan Gyalzen Norbu, anggota ekspedisi Jepang.",
            "Nanga Parbat (Urdu: ننگا پربت) merupakan sebuah gunung di Pakistan. Gunung ini terletak di bagian utara di negara itu. Gunung ini memiliki ketinggian 8.126 m (26.660 kaki) dan merupakan gunung terbesar kesembilan di dunia. Dalam tingkat kesulitan, medan gunung Nanga Parbat disebut sama beratnya dengan K2. Sulitnya medan pada gunung ini membuat ia mendapat julukan “The Man Eater”.\n" +
                    "\n" +
                    "Orang pertama yang mendaki di gunung ini ialah Hermann Buhl pada 3 Juli 1953.",
            "Annapurna adalah salah satu gunung tertinggi didunia[1] yang berada di Pegunungan Himalaya. Gunung ini memiliki delapan buah puncak, yang tertinggi adalah satu di antara tiga puncak yang dimiliki Annapurna I.\n" +
                    "\n" +
                    "Annapurna I memiliki tiga puncak yang disebut dengan:\n" +
                    "\n" +
                    "Puncak utama Annapurna I tinggi 8.091 mdpl\n" +
                    "Puncak tengah Annapurna I tinggi 8,051 mdpl\n" +
                    "Puncak timur Annapurna I tinggi 8,010 mdpl\n" +
                    "Selain itu Annapurna juga memiliki beberapa puncak yang lain dengan ketinggian di bawah 8.000 mdpl:\n" +
                    "\n" +
                    "Annapurna II tinggi 7.937 mdpl\n" +
                    "Annapurna III tinggi 7.555 mdpl\n" +
                    "Annapurna IV tinggi 7.525 mdpl\n" +
                    "Gangapurna tinggi 7.455 mdpl\n" +
                    "Annapurna Selatan tinggi 7.219 mdpl",

    };

    public static ArrayList<ModelGunung> getListData(){
        ModelGunung ModelGunung = null;
        ArrayList<ModelGunung> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            ModelGunung = new ModelGunung();
            ModelGunung.setLambangTeam(thumbnail[i]);
            ModelGunung.setNamaTeam(title[i]);
            ModelGunung.setPrivew(preview[i]);
            list.add(ModelGunung);
        }
        return list;
    }
}
