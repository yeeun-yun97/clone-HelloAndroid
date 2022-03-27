package com.github.yeeun_yun97.clone.HelloAndroid

import android.os.Parcel
import android.os.Parcelable

class MyParcelable() :Parcelable {
    lateinit var name : String
    lateinit var age : Int
    lateinit var gender : String

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyParcelable> {
        override fun createFromParcel(parcel: Parcel): MyParcelable {
            return MyParcelable(parcel)
        }

        override fun newArray(size: Int): Array<MyParcelable?> {
            return arrayOfNulls(size)
        }
    }
}