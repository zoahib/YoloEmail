package com.example.recycler_view_upload

import android.os.Parcel
import android.os.Parcelable

data class TravelData(val id:Int?,
                      val title:String?,
                      val Location:String?,
                      val distance:String?,
                      val StarRating:String?,
                      val overview:String?,
                      val image: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(Location)
        parcel.writeString(distance)
        parcel.writeString(StarRating)
        parcel.writeString(overview)
        parcel.writeInt(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TravelData> {
        override fun createFromParcel(parcel: Parcel): TravelData {
            return TravelData(parcel)
        }

        override fun newArray(size: Int): Array<TravelData?> {
            return arrayOfNulls(size)
        }
    }
}
