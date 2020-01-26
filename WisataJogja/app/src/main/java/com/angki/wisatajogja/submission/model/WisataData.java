package com.angki.wisatajogja.submission.model;

import com.angki.wisatajogja.submission.R;

import java.util.ArrayList;

public class WisataData {
    private static String[] wisataNames = {
            "Keraton Yogyakarta",
            "Situs Warungboto",
            "The Lost World Castle",
            "Taman Pelangi",
            "Candi Ijo",
            "Jogja Bay Waterpark",
            "Tebing Breksi",
            "Wisata Alam Kalibiru",
            "Hutan Pinus Mangunan",
            "Pantai Ngrawe(Mesra)"
    };


    private static String[] wisataDetails = {
            "Keraton Ngayogyakarta Hadiningrat atau Keraton Yogyakarta merupakan istana resmi Kesultanan Ngayogyakarta Hadiningrat yang kini berlokasi di Kota Yogyakarta, Daerah Istimewa Yogyakarta, Indonesia. Walaupun kesultanan tersebut secara resmi telah menjadi bagian Republik Indonesia pada tahun 1950, kompleks bangunan keraton ini masih berfungsi sebagai tempat tinggal sultan dan rumah tangga istananya yang masih menjalankan tradisi kesultanan hingga saat ini.",
            "Situs Warungboto atau Pesanggrahan Rejawinangun adalah salah satu bangunan cagar budaya yang terletak di Jalan Veteran No.77, Kelurahan Warungboto, Kecamatan Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta. Pada awalnya, situs ini merupakan lokasi sebuah pesanggrahan dan pemandian.",
            "The Lost World Castle merupakan salah satu obyek wisata di kawasan lereng Gunung Merapi yang terletak di Dusun Petung, Desa Kepuharjo Cangkringan, Sleman, Daerah Istimewa Yogyakarta, Indonesia. Obyek wisata ini dibangun menyerupai Benteng Takeshi dan dibangun di atas lahan 1,3 hektare pada tahun 2016.",
            "Taman Pelangi Yogyakarta merupakan tempat wisata malam yang menampilkan warna-warni lampu lampion, sehingga terlihat seperti pelangi. Taman wisata ini terletak di Jalan Padjajaran, dan berada di lokasi Museum Monumen Yogya Kembali Yogyakarta.",
            "Candi Ijo adalah sebuah kompleks percandian bercorak Hindu, berada 4 kilometer arah tenggara dari Candi Ratu Boko atau kira-kira 18 kilometer di sebelah timur kota Yogyakarta. Candi ini diperkirakan dibangun antara kurun abad ke-10 sampai dengan ke-11 Masehi pada saat zaman Kerajaan Medang periode Mataram.",
            "Salah satu waterpark terbesar di asia tenggara yang berlokasi di kota wisata terbesar kedua di Indonesia yaitu Yogyakarta. Dan belakangan ini sudah menjadi salah satu tujuan destinasi wisata di Yogyakarta.",
            "Tebing Breksi merupakan tempat wisata yang berada di wilayah Kabupaten Sleman. Lokasinya berada di sebelah kidul Candi Prambanan dan berdekatan dengan Candi Ijo serta Kompleks Keraton Boko. Lokasi Wisata Tebing Breksi tepatnya berada di Desa Sambirejo, Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55572.",
            "Kalibiru sebenarnya adalah sebuah nama hutan yang saat ini diolah menjadi sebuah tempat wisata alam. Hutan Kalibiru memiliki ketinggian 450 mdpl dan berupa kawasan perbukitan yang subur. Suhu udara di tempat ini sangat sejuk. Kalibiru dikelola oleh pemerintah dan masyarakat setempat sebagai wisata alam dan edukasi. Ada banyak hal yang bisa didapatkan di sana, termasuk outbond, penginapan, dan beberapa spot untuk mencari foto kekinian. Ada juga jalur trekking yang juga bisa dijadikan lokasi camping.",
            "Hutan Pinus Mangunan merupakan destinasi wisata alam yang berada di daerah Bantul yang dijadikan sebagai salah satu tempat selfie yang diburu banyak orang. Hutan Pinus Mangunan memiliki suasana yang dapat membuat pengunjung merasa damai, sangat asri, masih alami, serta dapat membuat hati tenang. Terdapat banyak deretan pohon pinus yang tumbuh subur di sepanjang hutan tersebut.",
            "Pantai Ngrawe merupakan pantai baru di Gunung Kidul yang memiliki konsep baru yaitu berupa taman dan fasilitas pendukung modern lainnya. Pantai ini juga memiliki taman beserta pohon palm yang menambah kecantikan dari pantai ini."
    };

    private static String[] wisataAlamat = {
            "Jl. Rotowijayan Blok No. 1, Panembahan, Kecamatan Kraton, Kota Yogyakarta, Daerah Istimewa Yogyakarta.",
            "Jl. Veteran No.77, Warungboto, Kec. Umbulharjo, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55164",
            "Petung, Kepuharjo, Kec. Cangkringan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55583.",
            "Jl. Ring Road Utara, Jongkang, Sariharjo, Kec. Ngaglik, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55284.",
            "Kikis, Sambirejo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55572.",
            "Jl. Utara Stadion, Jenengan, Maguwoharjo, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281.",
            "Gn. Sari, Sambirejo, Kec. Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55572.",
            "Jalan Waduk Sermo, Kokap, Hargowilis, Kalibiru, Hargowilis, Kokap, Kabupaten Kulon Progo, Daerah Istimewa Yogyakarta 55653.",
            "Sukorame, Mangunan, Dlingo, Bantul, Daerah Istimewa Yogyakarta 66783.",
            "Ngepung, Kemadang, Kec. Tanjungsari, Kabupaten Gunung Kidul, Daerah Istimewa Yogyakarta 55881."
    };

    private static String[] wisataJamBuka = {
            "08.00 - 14.00\n" +
                    "08.00 - 14.00\n" +
                    "08.00 - 14.00\n" +
                    "08.00 - 14.00\n" +
                    "08.00 - 12.00\n" +
                    "08.00 - 14.00\n" +
                    "08.00 - 14.00\n",
            "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n",
            "07.00 - 18.00\n" +
                    "07.00 - 18.00\n" +
                    "07.00 - 18.00\n" +
                    "07.00 - 18.00\n" +
                    "07.00 - 18.00\n" +
                    "07.00 - 18.00\n",
            "16.30 - 22.00\n" +
                    "16.30 - 22.00\n" +
                    "16.30 - 22.00\n" +
                    "16.30 - 22.00\n" +
                    "17.00 - 23.00\n" +
                    "17.00 - 23.00\n" +
                    "17.00 - 23.00\n",
            "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n",
            "09.00 - 17.00\n" +
                    "09.00 - 17.00\n" +
                    "09.00 - 17.00\n" +
                    "09.00 - 17.00\n" +
                    "09.00 - 17.00\n" +
                    "08.00 - 17.00\n" +
                    "08.00 - 17.00\n",
            "04.00 - 00.00\n" +
                    "04.00 - 00.00\n" +
                    "04.00 - 00.00\n" +
                    "04.00 - 00.00\n" +
                    "04.00 - 00.00\n" +
                    "04.00 - 00.00\n" +
                    "04.00 - 00.00\n",
            "06.30 - 17.00\n" +
                    "06.30 - 17.00\n" +
                    "06.30 - 17.00\n" +
                    "06.30 - 17.00\n" +
                    "06.30 - 17.00\n" +
                    "06.30 - 17.00\n" +
                    "06.30 - 17.00\n",
            "08.30 - 17.30\n" +
                    "08.30 - 17.30\n" +
                    "08.30 - 17.30\n" +
                    "08.30 - 17.30\n" +
                    "08.30 - 17.30\n" +
                    "08.30 - 17.30\n" +
                    "08.30 - 17.30\n",
            "Buka 24 jam\n" +
                    "Buka 24 jam\n" +
                    "Buka 24 jam\n" +
                    "Buka 24 jam\n" +
                    "Buka 24 jam\n" +
                    "Buka 24 jam\n" +
                    "Buka 24 jam\n"
    };

    private static int[] wisataImages = {
            R.drawable.keraton,
            R.drawable.warungboto,
            R.drawable.lost_world,
            R.drawable.taman_pelangi,
            R.drawable.candi_ijo,
            R.drawable.jogja_bay,
            R.drawable.breksi,
            R.drawable.kalibiru,
            R.drawable.hutan_pinus,
            R.drawable.pantai_ngrawe
    };

    public static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Wisata wisata = new Wisata();
            wisata.setName(wisataNames[position]);
            wisata.setAlamat(wisataAlamat[position]);
            wisata.setJamBuka(wisataJamBuka[position]);
            wisata.setDetail(wisataDetails[position]);
            wisata.setPhoto(wisataImages[position]);
            list.add(wisata);
        }
        return list;
    }
}
