package com.example.itc_recycle_view;

import java.util.ArrayList;

public class DataMovie {

    static String[] titles = {
            "The Sleepover",
            "Jumanji: The Next Level",
            "A Whisker Away",
            "The Angry Birds Movie 2",
            "Spirited Away",
            "Charlie and the Chocolate Factory",
            "Pokemon: Mewtwo Strikes Back - Evolution",
            "Feel the Beat",
            "Despicable Me 2",
            "Kung Fu Panda",
            "Howl's Moving Castle"

    };

    static String[] tags = {
            "2020, 7+, 1j 43m, Komedi Kriminal",
            "2019, 13+, 2j 3m, Film Adaptasi Buku Anak-Anak",
            "2020, 7+, 1j 45m, Film Jepang",
            "2019, 7+, 1j 36m, Dongeng Hewan",
            "2001, 13+, 2j 5m, Film yang Menerima Banyak Pujian",
            "2005, 7+, 1j 54m, Film yang Menerima Banyak Pujian",
            "2019, 7+, 1j 37m, Film Jepang",
            "2020, 7+, 1j 49m, Drama Showbiz",
            "2013, 7+, 1j 37m, Film yang Menerima Banyak Pujian",
            "2008, 7+, 1j 34m, Film yang Menerima Banyak Pujian",
            "2004, 7+, 1j 59m, Film yang Menerima Banyak Pujian"

    };

    static String[] images = {
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABaL40tNt0KSFSnEg-9x1e3TqcFL0gbb5Y-YJLwT4AsBgCDkrT-TTNuYviobjkIvyoiRia-nOIzy3R5uTRnD6Yb1_ssXuunN5B0QY8jr2kpbZwntkrvbzCeufhu41.jpg?r=d60",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABVezinbUCBqDOFHcNzkTZRTtp1FxYOdFCGyn667vZaeplnJlXI3GjUz5INxMZSNMPUYk8QcIhvS4iTDx9OM5KFnV-g8.jpg?r=731",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABc4kXQNJsaG7IviyfnthfgNDL9mAVj3UnAAJ6zskgamWUjcz4hEAKhLafdAbEBOdTvpBsWPxwGl_ZexBpip8LEJ37DAfsqUqRGeGDgHdM0OJdHcGAFx-fM313XzM.jpg?r=446",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABbnV_FYB0BMVU6Vb41RgWZf4wqHpm13u2h5mmfZHaFLykurdjpFLMXL3geka1ZO4yJklVkNZ2LWpxxTogl2_bt4WNds.jpg?r=346",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABWH_hrkbpSUv_VRHSD0Kf_pzjdcsgFt2_8QbZUBNw83RGFkCHpSTvu45ILjhtqxeHPZ7Vz8JuaPR8oXlpCH4xuNdIYw.jpg?r=19d",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABfsJKBtjCCxb6N9YLRjB2sxcJuFpDnZ8PoXmf6xrxKvm-KnarRjRP_8ng8wzMo1zLV_MJxDfd_Qn_scUAft6DCtknmU.jpg?r=6bc",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABRUpTD0i1hCSM32fAkhGOcHlJYTo7rU--ntWYonHBH0RhFKmlP4qxgo-Gnj1PqdJVv3ZNCqjqyMC3yHrLS9fGeHnCQF8fFyW3gR1RrFW7h7zixpyG3_K4SpIxh02.jpg?r=b2a",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABSkfDA2G9S5E6B6BWOJObkCKoHhK3x93bG0oxRKzoi2E6rH49EzoynH8zYMUWSIc7CZcAlqLhlsIgVzNy50djYD28CX-hCy4YXMNWhDg4tK80oknZiDE6nJ42QvC.jpg?r=808",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABXVKPGWq53jrIBs8hR_kBD6__uWXld0loVzdvQzV8Bw3mHf38j4Jvuaz3c1jTjauhwHAZlQiPrOWUAjmAF83sc9Ipwo.jpg?r=d23",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABTBYrCmIEWpdMkGGW5FmXwN0GFTIU45l2tABLZju2CjLfxMdOnILVIs4ZwgMjTmSX9hylo05zgzOECOtsQ97ejBy4hw.jpg?r=9f0",
            "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/X194eJsgWBDE2aQbaNdmCXGUP-Y/AAAABfgMmo7jhNqegmzxUWoKuvItNlBWZXHlieI6rjuaYipo21pCzhF_EWL--iyBpHI6-YyJyiEfSmf5BO_rQGsxb7Ucaxc.jpg?r=665"

    };

    public static ArrayList<Movie> getAllDataMovie(){
        ArrayList<Movie> list = new ArrayList<>();
        for (int i = 0; i <titles.length; i++){
            Movie movie = new Movie(
                titles[i],
                tags[i],
                images[i]
            );
            list.add(movie);
        }
        return list;
    }


}
