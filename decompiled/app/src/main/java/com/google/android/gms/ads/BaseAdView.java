package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.daaw.AbstractC8701uF1;
import com.daaw.AbstractC9820yE1;
import com.daaw.RO1;
import com.daaw.TS1;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    public final zzea B;

    public BaseAdView(Context context, int i) {
        super(context);
        this.B = new zzea(this, i);
    }

    public void destroy() {
        AbstractC9820yE1.a(getContext());
        if (((Boolean) AbstractC8701uF1.e.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ja)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.B.zzk();
                        } catch (IllegalStateException e) {
                            RO1.c(baseAdView.getContext()).a(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.B.zzk();
    }

    public AdListener getAdListener() {
        return this.B.zza();
    }

    public AdSize getAdSize() {
        return this.B.zzb();
    }

    public String getAdUnitId() {
        return this.B.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.B.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.B.zzd();
    }

    public boolean isLoading() {
        return this.B.zzA();
    }

    public void loadAd(final AdRequest adRequest) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC9820yE1.a(getContext());
        if (((Boolean) AbstractC8701uF1.f.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ma)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.B.zzm(adRequest.a);
                        } catch (IllegalStateException e) {
                            RO1.c(baseAdView.getContext()).a(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.B.zzm(adRequest.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                AbstractC4274eT1.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        AbstractC9820yE1.a(getContext());
        if (((Boolean) AbstractC8701uF1.g.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ka)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.B.zzn();
                        } catch (IllegalStateException e) {
                            RO1.c(baseAdView.getContext()).a(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.B.zzn();
    }

    public void resume() {
        AbstractC9820yE1.a(getContext());
        if (((Boolean) AbstractC8701uF1.h.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ia)).booleanValue()) {
                TS1.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.B.zzp();
                        } catch (IllegalStateException e) {
                            RO1.c(baseAdView.getContext()).a(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.B.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        this.B.zzr(adListener);
        if (adListener == 0) {
            this.B.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.B.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.B.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.B.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.B.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.B.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.B = new zzea(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.B = new zzea(this, attributeSet, false, i2);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.B = new zzea(this, attributeSet, z, i2);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.B = new zzea(this, attributeSet, z);
    }
}
