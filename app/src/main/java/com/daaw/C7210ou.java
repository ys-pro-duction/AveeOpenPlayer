package com.daaw;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7210ou implements Serializable {
    public final Map B;
    public final Set C;
    public final Set D;
    public final boolean E;

    public C7210ou(List list, Set set, Set set2, boolean z) {
        AbstractC6948ny0.c(set2, "Cron nicknames must not be null");
        if (!set2.contains(EnumC8604tu.REBOOT)) {
            AbstractC6948ny0.c(list, "Field definitions must not be null");
            AbstractC6948ny0.c(set, "Cron validations must not be null");
            AbstractC6948ny0.d(list, "Field definitions must not be empty");
            AbstractC6948ny0.a(!((YJ) list.get(0)).e(), "The first field must not be optional");
        }
        this.B = new EnumMap(EnumC8325su.class);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            YJ yj = (YJ) it.next();
            this.B.put(yj.d(), yj);
        }
        this.C = DesugarCollections.unmodifiableSet(set);
        this.D = DesugarCollections.unmodifiableSet(set2);
        this.E = z;
    }

    public boolean a(EnumC8325su enumC8325su) {
        return this.B.containsKey(enumC8325su);
    }

    public Set b() {
        return this.C;
    }

    public Set c() {
        return this.D;
    }

    public YJ d(EnumC8325su enumC8325su) {
        return (YJ) this.B.get(enumC8325su);
    }

    public Set e() {
        return new HashSet(this.B.values());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7210ou c7210ou = (C7210ou) obj;
            if (this.E == c7210ou.E && this.B.equals(c7210ou.B) && this.C.equals(c7210ou.C) && this.D.equals(c7210ou.D)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.E;
    }

    public int hashCode() {
        return Objects.hash(this.B, this.C, this.D, Boolean.valueOf(this.E));
    }
}
