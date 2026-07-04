package com.daaw;

import j$.util.DesugarCollections;
import j$.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.eT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4273eT0 implements InterfaceC6094ku {
    public final C7210ou B;
    public final Map C;
    public String D;

    public C4273eT0(C7210ou c7210ou, List list) {
        this.B = (C7210ou) AbstractC6948ny0.c(c7210ou, "CronDefinition must not be null");
        AbstractC6948ny0.c(list, "CronFields cannot be null");
        this.C = new EnumMap(EnumC8325su.class);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8046ru c8046ru = (C8046ru) it.next();
            this.C.put(c8046ru.e(), c8046ru);
        }
    }

    public String a() {
        if (this.D == null) {
            ArrayList arrayList = new ArrayList(this.C.values());
            List.EL.sort(arrayList, C8046ru.b());
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append(String.format("%s ", ((C8046ru) it.next()).d().c()));
            }
            this.D = sb.toString().trim();
        }
        return this.D;
    }

    public InterfaceC6094ku b() {
        for (Map.Entry entry : m().entrySet()) {
            ((C8046ru) entry.getValue()).d().a(new C6285lc1(v().d((EnumC8325su) entry.getKey()).c()));
        }
        for (AbstractC6652mu abstractC6652mu : v().b()) {
            if (!abstractC6652mu.b(this)) {
                throw new IllegalArgumentException(String.format("Invalid cron expression: %s. %s", a(), abstractC6652mu.a()));
            }
        }
        return this;
    }

    @Override // com.daaw.InterfaceC6094ku
    public Map m() {
        return DesugarCollections.unmodifiableMap(this.C);
    }

    @Override // com.daaw.InterfaceC6094ku
    public C8046ru p(EnumC8325su enumC8325su) {
        return (C8046ru) this.C.get(AbstractC6948ny0.c(enumC8325su, "CronFieldName must not be null"));
    }

    @Override // com.daaw.InterfaceC6094ku
    public C7210ou v() {
        return this.B;
    }
}
