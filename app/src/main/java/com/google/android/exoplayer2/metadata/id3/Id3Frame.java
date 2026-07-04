package com.google.android.exoplayer2.metadata.id3;

import com.daaw.AbstractC7115ob;
import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String B;

    public Id3Frame(String str) {
        this.B = (String) AbstractC7115ob.e(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.B;
    }
}
