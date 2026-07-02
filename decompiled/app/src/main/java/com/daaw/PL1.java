package com.daaw;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class PL1 extends RL1 {
    public static final C3972dN1 B = new C3972dN1();

    @Override // com.daaw.SL1
    public final boolean a(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, PL1.class.getClassLoader()));
        } catch (Throwable unused) {
            AbstractC4274eT1.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.daaw.SL1
    public final boolean l(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, PL1.class.getClassLoader()));
        } catch (Throwable unused) {
            AbstractC4274eT1.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.daaw.SL1
    public final ZM1 o(String str) {
        return new BinderC7896rN1((RtbAdapter) Class.forName(str, false, C3972dN1.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.daaw.SL1
    public final ZL1 zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, PL1.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new BinderC9573xM1((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new BinderC9573xM1((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                AbstractC4274eT1.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                AbstractC4274eT1.zze("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new BinderC9573xM1(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new BinderC9573xM1(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            AbstractC4274eT1.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }
}
