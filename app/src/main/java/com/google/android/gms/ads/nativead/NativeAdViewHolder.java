package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7506py0;
import com.daaw.BinderC7744qp0;
import com.daaw.CG1;
import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdViewHolder {
    public static final WeakHashMap zza = new WeakHashMap();
    public CG1 a;
    public WeakReference b;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        AbstractC7506py0.m(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            AbstractC4274eT1.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            AbstractC4274eT1.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.b = new WeakReference(view);
        this.a = zzay.zza().zzi(view, a(map), a(map2));
    }

    public static final HashMap a(Map map) {
        return map == null ? new HashMap() : new HashMap(map);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.a.zzb(BinderC7744qp0.Z2(view));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.daaw.rX, java.lang.Object] */
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
        ?? A = nativeAd.a();
        WeakReference weakReference = this.b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            AbstractC4274eT1.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        CG1 cg1 = this.a;
        if (cg1 != 0) {
            try {
                cg1.zzc(A);
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        CG1 cg1 = this.a;
        if (cg1 != null) {
            try {
                cg1.zzd();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
