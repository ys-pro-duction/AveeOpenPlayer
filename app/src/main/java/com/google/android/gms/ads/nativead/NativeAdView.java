package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC7934rX;
import com.daaw.InterfaceC9270wG1;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    public final FrameLayout B;
    public final InterfaceC9270wG1 C;

    public NativeAdView(Context context) {
        super(context);
        this.B = d(context);
        this.C = e();
    }

    public final View a(String str) {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 != null) {
            try {
                InterfaceC7934rX interfaceC7934rXZzb = interfaceC9270wG1.zzb(str);
                if (interfaceC7934rXZzb != null) {
                    return (View) BinderC7744qp0.I(interfaceC7934rXZzb);
                }
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.B);
    }

    public final /* synthetic */ void b(MediaContent mediaContent) {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                interfaceC9270wG1.zzbB(((zzep) mediaContent).zzc());
            } else if (mediaContent == null) {
                interfaceC9270wG1.zzbB(null);
            } else {
                AbstractC4274eT1.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.B;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 == null || scaleType == null) {
            return;
        }
        try {
            interfaceC9270wG1.zzbC(BinderC7744qp0.Z2(scaleType));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public void destroy() {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 != null) {
            try {
                interfaceC9270wG1.zzc();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to destroy native ad view", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.C != null) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ya)).booleanValue()) {
                try {
                    this.C.zzd(BinderC7744qp0.Z2(motionEvent));
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC9270wG1 e() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.B;
        return zzay.zza().zzh(frameLayout.getContext(), this, frameLayout);
    }

    public final void f(String str, View view) {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 != null) {
            try {
                interfaceC9270wG1.zzbz(str, BinderC7744qp0.Z2(view));
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call setAssetView on delegate", e);
            }
        }
    }

    public AdChoicesView getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof AdChoicesView) {
            return (AdChoicesView) viewA;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        AbstractC4274eT1.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 != null) {
            try {
                interfaceC9270wG1.zze(BinderC7744qp0.Z2(view), i);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.B);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.B == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        f("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 != null) {
            try {
                interfaceC9270wG1.zzbA(BinderC7744qp0.Z2(view));
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        f("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new zzb(this));
        mediaView.b(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.daaw.rX, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setNativeAd(NativeAd nativeAd) {
        InterfaceC9270wG1 interfaceC9270wG1 = this.C;
        if (interfaceC9270wG1 != 0) {
            try {
                interfaceC9270wG1.zzbD(nativeAd.a());
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = d(context);
        this.C = e();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = d(context);
        this.C = e();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.B = d(context);
        this.C = e();
    }
}
