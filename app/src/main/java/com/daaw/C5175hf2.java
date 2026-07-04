package com.daaw;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.hf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5175hf2 {
    public final C2958Zh2 a;
    public final C6023kh2 b;
    public final B22 c;
    public final InterfaceC10208ze2 d;

    public C5175hf2(C2958Zh2 c2958Zh2, C6023kh2 c6023kh2, B22 b22, InterfaceC10208ze2 interfaceC10208ze2) {
        this.a = c2958Zh2;
        this.b = c6023kh2;
        this.c = b22;
        this.d = interfaceC10208ze2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        InterfaceC9334wW1 interfaceC9334wW1A = this.a.a(zzq.zzc(), null, null);
        ((View) interfaceC9334wW1A).setVisibility(8);
        interfaceC9334wW1A.C("/sendMessageToSdk", new HI1() { // from class: com.daaw.cf2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.b((InterfaceC9334wW1) obj, map);
            }
        });
        interfaceC9334wW1A.C("/adMuted", new HI1() { // from class: com.daaw.df2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.c((InterfaceC9334wW1) obj, map);
            }
        });
        this.b.j(new WeakReference(interfaceC9334wW1A), "/loadHtml", new HI1() { // from class: com.daaw.ef2
            @Override // com.daaw.HI1
            public final void a(Object obj, final Map map) {
                InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) obj;
                InterfaceC7936rX1 interfaceC7936rX1ZzN = interfaceC9334wW1.zzN();
                final C5175hf2 c5175hf2 = this.a;
                interfaceC7936rX1ZzN.I(new InterfaceC7379pX1() { // from class: com.daaw.bf2
                    @Override // com.daaw.InterfaceC7379pX1
                    public final void zza(boolean z, int i, String str, String str2) {
                        c5175hf2.d(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    interfaceC9334wW1.loadData(str, "text/html", "UTF-8");
                } else {
                    interfaceC9334wW1.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.b.j(new WeakReference(interfaceC9334wW1A), "/showOverlay", new HI1() { // from class: com.daaw.ff2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.e((InterfaceC9334wW1) obj, map);
            }
        });
        this.b.j(new WeakReference(interfaceC9334wW1A), "/hideOverlay", new HI1() { // from class: com.daaw.gf2
            @Override // com.daaw.HI1
            public final void a(Object obj, Map map) {
                this.a.f((InterfaceC9334wW1) obj, map);
            }
        });
        return (View) interfaceC9334wW1A;
    }

    public final /* synthetic */ void b(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        this.b.g("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void c(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        this.d.zzg();
    }

    public final /* synthetic */ void d(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.b.g("sendMessageToNativeJs", map2);
    }

    public final /* synthetic */ void e(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        AbstractC4274eT1.zzi("Showing native ads overlay.");
        interfaceC9334wW1.h().setVisibility(0);
        this.c.l(true);
    }

    public final /* synthetic */ void f(InterfaceC9334wW1 interfaceC9334wW1, Map map) {
        AbstractC4274eT1.zzi("Hiding native ads overlay.");
        interfaceC9334wW1.h().setVisibility(8);
        this.c.l(false);
    }
}
