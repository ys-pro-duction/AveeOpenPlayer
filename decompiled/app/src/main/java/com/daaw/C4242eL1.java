package com.daaw;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.eL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4242eL1 implements InterfaceC7884rK1, InterfaceC3964dL1 {
    public final InterfaceC3964dL1 B;
    public final HashSet C = new HashSet();

    public C4242eL1(InterfaceC3964dL1 interfaceC3964dL1) {
        this.B = interfaceC3964dL1;
    }

    @Override // com.daaw.InterfaceC7327pK1
    public final /* synthetic */ void U(String str, Map map) {
        AbstractC7606qK1.a(this, str, map);
    }

    @Override // com.daaw.InterfaceC7884rK1
    public final /* synthetic */ void a(String str, String str2) {
        AbstractC7606qK1.c(this, str, str2);
    }

    @Override // com.daaw.InterfaceC3964dL1
    public final void g0(String str, HI1 hi1) {
        this.B.g0(str, hi1);
        this.C.add(new AbstractMap.SimpleEntry(str, hi1));
    }

    @Override // com.daaw.InterfaceC7884rK1
    public final /* synthetic */ void l(String str, JSONObject jSONObject) {
        AbstractC7606qK1.b(this, str, jSONObject);
    }

    @Override // com.daaw.InterfaceC3964dL1
    public final void r(String str, HI1 hi1) {
        this.B.r(str, hi1);
        this.C.remove(new AbstractMap.SimpleEntry(str, hi1));
    }

    @Override // com.daaw.CK1
    public final /* synthetic */ void y0(String str, JSONObject jSONObject) {
        AbstractC7606qK1.d(this, str, jSONObject);
    }

    @Override // com.daaw.InterfaceC7884rK1
    public final void zza(String str) {
        this.B.zza(str);
    }

    public final void zzc() {
        for (AbstractMap.SimpleEntry simpleEntry : this.C) {
            zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((HI1) simpleEntry.getValue()).toString())));
            this.B.r((String) simpleEntry.getKey(), (HI1) simpleEntry.getValue());
        }
        this.C.clear();
    }
}
