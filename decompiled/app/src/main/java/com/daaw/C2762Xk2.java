package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Xk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2762Xk2 {
    public final Context a;
    public final ApplicationInfo b;
    public String e = "";
    public final int c = ((Integer) zzba.zzc().b(AbstractC9820yE1.S8)).intValue();
    public final int d = ((Integer) zzba.zzc().b(AbstractC9820yE1.T8)).intValue();

    public C2762Xk2(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException {
        Drawable drawable;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.a;
            String str = this.b.packageName;
            HandlerC8451tM2 handlerC8451tM2 = zzt.zza;
            jSONObject.put("name", C6878nj1.a(context).d(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.b.packageName);
        com.google.android.gms.ads.internal.zzt.zzp();
        jSONObject.put("adMobAppId", zzt.zzp(this.a));
        if (this.e.isEmpty()) {
            try {
                drawable = (Drawable) C6878nj1.a(this.a).e(this.b.packageName).b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.c, this.d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.c, this.d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = strEncodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", this.c);
            jSONObject.put("iconHeightPx", this.d);
        }
        return jSONObject;
    }
}
