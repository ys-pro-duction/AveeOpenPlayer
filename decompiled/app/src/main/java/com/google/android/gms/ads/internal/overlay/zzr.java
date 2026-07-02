package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7494pv0;
import com.daaw.AbstractC9820yE1;
import com.daaw.Kk3;
import com.daaw.XS1;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    public final ImageButton B;
    public final zzad C;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        this.C = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.B = imageButton;
        b();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int iB = XS1.B(context, zzqVar.zza);
        zzay.zzb();
        int iB2 = XS1.B(context, 0);
        zzay.zzb();
        int iB3 = XS1.B(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(iB, iB2, iB3, XS1.B(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int iB4 = XS1.B(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(iB4, XS1.B(context, zzqVar.zzd + zzqVar.zzc), 17));
        long jLongValue = ((Long) zzba.zzc().b(AbstractC9820yE1.b1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        Kk3 kk3 = ((Boolean) zzba.zzc().b(AbstractC9820yE1.c1)).booleanValue() ? new Kk3(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(kk3);
    }

    public final void b() {
        String str = (String) zzba.zzc().b(AbstractC9820yE1.a1);
        if (!AbstractC7494pv0.f() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.B.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesD = com.google.android.gms.ads.internal.zzt.zzo().d();
        if (resourcesD == null) {
            this.B.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesD.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesD.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            AbstractC4274eT1.zze("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.B.setImageResource(R.drawable.btn_dialog);
        } else {
            this.B.setImageDrawable(drawable);
            this.B.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.C;
        if (zzadVar != null) {
            zzadVar.zzj();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.B.setVisibility(0);
            return;
        }
        this.B.setVisibility(8);
        if (((Long) zzba.zzc().b(AbstractC9820yE1.b1)).longValue() > 0) {
            this.B.animate().cancel();
            this.B.clearAnimation();
        }
    }
}
