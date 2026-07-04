package com.daaw;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.rE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7860rE1 {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str = (String) zzba.zzc().b((AbstractC7582qE1) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(CE1.a());
        return arrayList;
    }

    public final List b() {
        List listA = a();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            String str = (String) zzba.zzc().b((AbstractC7582qE1) it.next());
            if (!TextUtils.isEmpty(str)) {
                listA.add(str);
            }
        }
        listA.addAll(CE1.b());
        return listA;
    }

    public final void c(AbstractC7582qE1 abstractC7582qE1) {
        this.b.add(abstractC7582qE1);
    }

    public final void d(AbstractC7582qE1 abstractC7582qE1) {
        this.a.add(abstractC7582qE1);
    }

    public final void e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (AbstractC7582qE1 abstractC7582qE1 : this.a) {
            if (abstractC7582qE1.e() == 1) {
                abstractC7582qE1.d(editor, abstractC7582qE1.a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            AbstractC4274eT1.zzg("Flag Json is null.");
        }
    }
}
