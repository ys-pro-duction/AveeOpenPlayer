package com.revenuecat.purchases.utils;

import android.os.Parcel;
import com.daaw.G10;
import com.daaw.InterfaceC2166Rs0;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/utils/JSONObjectParceler;", "Lcom/daaw/Rs0;", "Lorg/json/JSONObject;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lorg/json/JSONObject;", "", "flags", "Lcom/daaw/G91;", "write", "(Lorg/json/JSONObject;Landroid/os/Parcel;I)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JSONObjectParceler implements InterfaceC2166Rs0 {
    public static final JSONObjectParceler INSTANCE = new JSONObjectParceler();

    private JSONObjectParceler() {
    }

    public JSONObject create(Parcel parcel) {
        G10.g(parcel, "parcel");
        return new JSONObject(parcel.readString());
    }

    public JSONObject[] newArray(int i) {
        return (JSONObject[]) InterfaceC2166Rs0.a.a(this, i);
    }

    public void write(JSONObject jSONObject, Parcel parcel, int i) {
        G10.g(jSONObject, "<this>");
        G10.g(parcel, "parcel");
        parcel.writeString(jSONObject.toString());
    }
}
