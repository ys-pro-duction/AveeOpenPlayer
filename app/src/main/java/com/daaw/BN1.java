package com.daaw;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class BN1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ DN1 D;

    public BN1(DN1 dn1, String str, String str2) {
        this.D = dn1;
        this.B = str;
        this.C = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.D.d.getSystemService("download");
        try {
            String str = this.B;
            String str2 = this.C;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.D.c("Could not store picture.");
        }
    }
}
