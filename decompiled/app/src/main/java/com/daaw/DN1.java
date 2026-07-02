package com.daaw;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DN1 extends GN1 {
    public final Map c;
    public final Context d;

    public DN1(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        super(interfaceC9334wW1, "storePicture");
        this.c = map;
        this.d = interfaceC9334wW1.zzi();
    }

    public final void i() {
        if (this.d == null) {
            c("Activity context is not available");
            return;
        }
        zzt.zzp();
        if (!new C3936dE1(this.d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        zzt.zzp();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesD = zzt.zzo().d();
        zzt.zzp();
        AlertDialog.Builder builderZzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.d);
        builderZzJ.setTitle(resourcesD != null ? resourcesD.getString(R.string.s1) : "Save image");
        builderZzJ.setMessage(resourcesD != null ? resourcesD.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builderZzJ.setPositiveButton(resourcesD != null ? resourcesD.getString(R.string.s3) : "Accept", new BN1(this, str, lastPathSegment));
        builderZzJ.setNegativeButton(resourcesD != null ? resourcesD.getString(R.string.s4) : "Decline", new CN1(this));
        builderZzJ.create().show();
    }
}
