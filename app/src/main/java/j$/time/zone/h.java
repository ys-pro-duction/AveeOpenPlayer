package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements PrivilegedAction {
    public final /* synthetic */ ArrayList a;

    public h(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                i iVar = (i) i.class.cast(Class.forName(property, true, i.class.getClassLoader()).newInstance());
                i.b(iVar);
                this.a.add(iVar);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        i.b(new i());
        return null;
    }
}
