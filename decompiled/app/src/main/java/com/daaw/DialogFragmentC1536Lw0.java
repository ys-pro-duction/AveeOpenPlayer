package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import com.daaw.C2078Qw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Lw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC1536Lw0 extends DialogFragment {
    public static C0642Dg1 J = new C0642Dg1();
    public static C0642Dg1 K = new C0642Dg1();
    public static C0746Eg1 L = new C0746Eg1();
    public static C0321Ag1 M = new C0321Ag1();
    public LinearLayout B;
    public LinearLayout C;
    public boolean D = false;
    public boolean E = false;
    public InterfaceC6129l2 F = null;
    public ArrayList G = new ArrayList(0);
    public long[] H = new long[0];
    public ArrayList I = new ArrayList(0);

    /* JADX INFO: renamed from: com.daaw.Lw0$a */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ CheckBox C;
        public final /* synthetic */ List D;

        public a(boolean z, CheckBox checkBox, List list) {
            this.B = z;
            this.C = checkBox;
            this.D = list;
        }

        public final /* synthetic */ void b(Activity activity, long j, boolean z, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            AbstractC1765Ob1.j(DialogFragmentC1536Lw0.this);
            DialogFragmentC1536Lw0.J.a(activity, Long.valueOf(j), jArr, arrayList, Boolean.valueOf(z));
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            final boolean z = this.B && this.C.isChecked();
            if (i < 0 || i >= this.D.size()) {
                return;
            }
            final long jLongValue = ((Long) this.D.get(i)).longValue();
            final Activity activity = DialogFragmentC1536Lw0.this.getActivity();
            DialogFragmentC1536Lw0.this.d(new InterfaceC6129l2() { // from class: com.daaw.Kw0
                @Override // com.daaw.InterfaceC6129l2
                public final void a(Object obj, Object obj2, Object obj3) {
                    this.a.b(activity, jLongValue, z, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lw0$b */
    public class b implements AdapterView.OnItemClickListener {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ CheckBox C;
        public final /* synthetic */ CheckBox D;
        public final /* synthetic */ C2138Rl0 E;

        public b(boolean z, CheckBox checkBox, CheckBox checkBox2, C2138Rl0 c2138Rl0) {
            this.B = z;
            this.C = checkBox;
            this.D = checkBox2;
            this.E = c2138Rl0;
        }

        public final /* synthetic */ void b(B61 b61, boolean z, boolean z2, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            AbstractC1765Ob1.j(DialogFragmentC1536Lw0.this);
            DialogFragmentC1536Lw0.K.a((String) b61.a, (String) b61.b, arrayList2, Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            final boolean z = this.B && this.C.isChecked();
            final boolean zIsChecked = this.D.isChecked();
            if (i < 0 || i >= this.E.size()) {
                return;
            }
            final B61 b61 = this.E.get(i);
            DialogFragmentC1536Lw0.this.d(new InterfaceC6129l2() { // from class: com.daaw.Mw0
                @Override // com.daaw.InterfaceC6129l2
                public final void a(Object obj, Object obj2, Object obj3) {
                    this.a.b(b61, z, zIsChecked, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lw0$c */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC1536Lw0 dialogFragmentC1536Lw0 = DialogFragmentC1536Lw0.this;
            if (dialogFragmentC1536Lw0.E) {
                dialogFragmentC1536Lw0.d(new InterfaceC6129l2() { // from class: com.daaw.Nw0
                    @Override // com.daaw.InterfaceC6129l2
                    public final void a(Object obj, Object obj2, Object obj3) {
                        DialogFragmentC1536Lw0.M.a((long[]) obj, (ArrayList) obj2);
                    }
                });
            } else {
                dialogFragmentC1536Lw0.D = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lw0$d */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC1536Lw0.this.D = true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lw0$e */
    public class e implements C2078Qw0.d {
        public final /* synthetic */ int[] a;
        public final /* synthetic */ ArrayList b;

        public e(int[] iArr, ArrayList arrayList) {
            this.a = iArr;
            this.b = arrayList;
        }

        @Override // com.daaw.C2078Qw0.d
        public void a(C2078Qw0.b bVar, Object obj, Object obj2) {
            int[] iArr = this.a;
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i >= this.b.size()) {
                DialogFragmentC1536Lw0 dialogFragmentC1536Lw0 = DialogFragmentC1536Lw0.this;
                dialogFragmentC1536Lw0.f(dialogFragmentC1536Lw0.G);
            }
        }
    }

    public static DialogFragmentC1536Lw0 c(List list, Boolean bool) {
        DialogFragmentC1536Lw0 dialogFragmentC1536Lw0E = e(list, bool.booleanValue());
        AbstractC1765Ob1.w(dialogFragmentC1536Lw0E, "PlaylistPickerDialog");
        return dialogFragmentC1536Lw0E;
    }

    public static DialogFragmentC1536Lw0 e(List list, boolean z) {
        DialogFragmentC1536Lw0 dialogFragmentC1536Lw0 = new DialogFragmentC1536Lw0();
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2078Qw0) it.next()).g());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", z ? 1 : 0);
        bundle.putStringArrayList("arg2", arrayList);
        dialogFragmentC1536Lw0.setArguments(bundle);
        return dialogFragmentC1536Lw0;
    }

    public final void d(InterfaceC6129l2 interfaceC6129l2) {
        if (this.E) {
            interfaceC6129l2.a(this.H, this.I, this.G);
            return;
        }
        this.B.setVisibility(0);
        this.C.setVisibility(8);
        this.F = interfaceC6129l2;
    }

    public final void f(ArrayList arrayList) {
        InterfaceC6129l2 interfaceC6129l2;
        this.H = new long[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.H[i] = ((C2078Qw0) it.next()).l();
            i++;
        }
        this.B.setVisibility(8);
        this.C.setVisibility(0);
        this.E = true;
        if (this.D || (interfaceC6129l2 = this.F) == null) {
            return;
        }
        interfaceC6129l2.a(this.H, this.I, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.widget.ArrayAdapter r3, java.util.Collection r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L9
            int r0 = r4.size()
            r1 = 1
            if (r0 >= r1) goto L1b
        L9:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.daaw.JD0.u4
            java.lang.String r0 = r0.getString(r1)
            r4.add(r0)
        L1b:
            r3.clear()
            r3.addAll(r4)
            r3.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.DialogFragmentC1536Lw0.g(android.widget.ArrayAdapter, java.util.Collection):void");
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Handler handler = new Handler(Looper.getMainLooper());
        Bundle arguments = getArguments();
        boolean z = arguments.getInt("arg1") != 0;
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg2");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(JD0.f1);
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.g, null);
        builder.setView(viewInflate);
        this.B = (LinearLayout) viewInflate.findViewById(AbstractC5056hD0.C0);
        this.C = (LinearLayout) viewInflate.findViewById(AbstractC5056hD0.B0);
        TabHost tabHost = (TabHost) viewInflate.findViewById(AbstractC5056hD0.p3);
        tabHost.setup();
        TabHost.TabSpec tabSpecNewTabSpec = tabHost.newTabSpec("Tab One");
        tabSpecNewTabSpec.setContent(AbstractC5056hD0.n3);
        tabSpecNewTabSpec.setIndicator(getResources().getString(JD0.d5));
        tabHost.addTab(tabSpecNewTabSpec);
        TabHost.TabSpec tabSpecNewTabSpec2 = tabHost.newTabSpec("Tab Two");
        tabSpecNewTabSpec2.setContent(AbstractC5056hD0.o3);
        tabSpecNewTabSpec2.setIndicator(getResources().getString(JD0.c5));
        tabHost.addTab(tabSpecNewTabSpec2);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.k0);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.l0);
        checkBox2.setChecked(true);
        if (z) {
            checkBox.setVisibility(0);
            checkBox.setChecked(true);
        } else {
            checkBox.setVisibility(8);
        }
        ListView listView = (ListView) viewInflate.findViewById(AbstractC5056hD0.W1);
        listView.setTextFilterEnabled(true);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), AbstractC9815yD0.c);
        listView.setAdapter((ListAdapter) arrayAdapter);
        ListView listView2 = (ListView) viewInflate.findViewById(AbstractC5056hD0.X1);
        listView2.setTextFilterEnabled(true);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(getActivity(), AbstractC9815yD0.c);
        listView2.setAdapter((ListAdapter) arrayAdapter2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AbstractC1454Lb1.c(getActivity(), arrayList, arrayList2);
        g(arrayAdapter, arrayList2);
        C2138Rl0 c2138Rl0 = (C2138Rl0) L.a(new C2138Rl0());
        ArrayList arrayList3 = new ArrayList(c2138Rl0.size());
        Iterator it = c2138Rl0.iterator();
        while (it.hasNext()) {
            arrayList3.add(C1204Ir.Z((String) ((B61) it.next()).b));
        }
        g(arrayAdapter2, arrayList3);
        listView.setOnItemClickListener(new a(z, checkBox, arrayList));
        listView2.setOnItemClickListener(new b(z, checkBox, checkBox2, c2138Rl0));
        builder.setPositiveButton(JD0.e1, new c());
        builder.setNegativeButton(JD0.S0, new d());
        this.G = new ArrayList(stringArrayList.size());
        this.I = new ArrayList(this.G.size());
        int[] iArr = {0};
        Iterator<String> it2 = stringArrayList.iterator();
        while (it2.hasNext()) {
            C2078Qw0 c2078Qw0 = new C2078Qw0(it2.next());
            this.G.add(c2078Qw0);
            this.I.add(c2078Qw0.m());
            c2078Qw0.i(handler, new e(iArr, stringArrayList), null, null);
        }
        return builder.create();
    }
}
