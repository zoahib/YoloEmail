package com.example.recycler_view_upload

var Travellist= mutableListOf<TravelData>()
object setData {
    fun SetTravelData():List<TravelData>{

        Travellist.add(
            TravelData(
                1,
                "Mountains",
                " Pakistan",
                "227.9",
                "3.721",
                "Mountain Description",
                R.drawable.fig001
            )
        )
        Travellist.add(
            TravelData(
                2,
                "Mountain2",
                " Khaiber Pakhtoon",
                "150.0",
                "1.62",
                "Mountain Description"
                ,R.drawable.fig002
            )
        )
        Travellist.add(
            TravelData(
                3,
                "Mountain3",
                " Swisss land",
                "4497.1",
                "11.15",
                "Mountain Description"
                ,R.drawable.fig003
            )
        )
        Travellist.add(
            TravelData(
                4,
                "Mountain4",
                " Khaiber Pakhtoon",
                "149.6",
                "9.807",
                "Mountain Description"
                ,R.drawable.fig004
            )
        )
        Travellist.add(
            TravelData(
                5,
                "Mountain4",
                " Khaiber Pakhtoon",
                "149.6",
                "9.807",
                "Mountain Description"
                ,R.drawable.fig005
            )
        )
        Travellist.add(
            TravelData(
                6,
                "Mountain4",
                " Khaiber Pakhtoon",
                "149.6",
                "9.807",
                "Mountain Description"
                ,R.drawable.fig006
            )
        )
        Travellist.add(
            TravelData(
                7,
                "Mountain4",
                " Khaiber Pakhtoon",
                "149.6",
                "9.807",
                "Mountain Description"
                ,R.drawable.fig007
            )
        )
        Travellist.add(
            TravelData(
                8,
                "Mountain4",
                " Khaiber Pakhtoon",
                "149.6",
                "9.807",
                "Mountain Description"
                ,R.drawable.fig008
            )
        )
        return Travellist
    }

    fun addmoreData(id:Int,title:String,Location:String,distance:String,StarRating:String,overview:String,image:Int):List<TravelData>{
        var id: Int =id
        var title:String=title
        var Location:String=Location
        var distance:String=distance
        var StarRating:String=StarRating
        var overview:String=overview
        var image:Int=image




        Travellist.add(
            TravelData(
                id,
                title,
                Location,
                distance,
                StarRating,
                overview,
                image
            )
        )
        return Travellist
    }

}