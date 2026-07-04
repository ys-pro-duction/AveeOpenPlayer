package com.daaw;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RT1 implements InterfaceC9817yD2 {
    public final Application a;
    public final C4834gR1 b;
    public final Handler c;
    public final Executor d;
    public final DS2 e;
    public final C8056rw1 f;
    public final C8987vF1 g;
    public final C0814Ex1 h;

    public RT1(Application application, C4834gR1 c4834gR1, Handler handler, Executor executor, DS2 ds2, C8056rw1 c8056rw1, C8987vF1 c8987vF1, C0814Ex1 c0814Ex1) {
        this.a = application;
        this.b = c4834gR1;
        this.c = handler;
        this.d = executor;
        this.e = ds2;
        this.f = c8056rw1;
        this.g = c8987vF1;
        this.h = c0814Ex1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.daaw.InterfaceC9817yD2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.RT1.a(java.lang.String, org.json.JSONObject):boolean");
    }

    public final /* synthetic */ void b() {
        String strConcat;
        Application application = this.a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            jSONObject.put("stored_infos_map", this.h.b());
        } catch (JSONException unused) {
        }
        this.g.b().c("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    public final void c(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri uri = Uri.parse(str);
        this.e.b(uri.getQueryParameter("action"), uri.getQueryParameter("args"), this, this.f);
    }

    public final void d(int i, String str, String str2) {
        this.g.g(new C4304ea3(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    public final void e(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        TextUtils.isEmpty(strOptString);
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString));
        }
        try {
            this.b.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            "Action[browser]: can not open url: ".concat(String.valueOf(strOptString));
        }
    }

    @Override // com.daaw.InterfaceC9817yD2
    public final Executor zza() {
        final Handler handler = this.c;
        return new Executor() { // from class: com.daaw.HS1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }
}
