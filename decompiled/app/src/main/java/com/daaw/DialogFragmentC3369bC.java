package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.bC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC3369bC extends DialogFragment {
    public static C0321Ag1 F = new C0321Ag1();
    public ArrayList B = new ArrayList();
    public ArrayAdapter C;
    public EditText D;
    public File E;

    /* JADX INFO: renamed from: com.daaw.bC$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC3369bC.this.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC3369bC.this.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC3369bC.this.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC3369bC.this.k(new File(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().l()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC3369bC.this.k(new File(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().q()));
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String parent = DialogFragmentC3369bC.this.E != null ? DialogFragmentC3369bC.this.E.getParent() : null;
            if (parent != null) {
                DialogFragmentC3369bC.this.l(parent);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$g */
    public class g implements AdapterView.OnItemClickListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (i >= DialogFragmentC3369bC.this.B.size() || !((File) DialogFragmentC3369bC.this.B.get(i)).isDirectory()) {
                return;
            }
            DialogFragmentC3369bC.this.l(((File) DialogFragmentC3369bC.this.B.get(i)).getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$h */
    public class h implements DialogInterface.OnClickListener {
        public final /* synthetic */ String B;

        public h(String str) {
            this.B = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC3369bC dialogFragmentC3369bC = DialogFragmentC3369bC.this;
            dialogFragmentC3369bC.j(dialogFragmentC3369bC.D.getText().toString(), this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.bC$i */
    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC3369bC.this.getDialog().cancel();
        }
    }

    public static DialogFragmentC3369bC g(String str, int i2, String str2) {
        DialogFragmentC3369bC dialogFragmentC3369bC = new DialogFragmentC3369bC();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", i2);
        bundle.putString("arg2", str2);
        bundle.putString("arg3", str);
        dialogFragmentC3369bC.setArguments(bundle);
        AbstractC1765Ob1.w(dialogFragmentC3369bC, "DirectoryPickerDialog");
        return dialogFragmentC3369bC;
    }

    public static ArrayList h(File[] fileArr, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (fileArr == null) {
            return arrayList;
        }
        for (File file : fileArr) {
            if ((!z || file.isDirectory()) && (z2 || !file.isHidden())) {
                arrayList.add(file);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String[] i(ArrayList arrayList) {
        String[] strArr = new String[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = ((File) it.next()).getName();
            i2++;
        }
        return strArr;
    }

    public final void j(String str, String str2) {
        F.a(str, str2);
    }

    public final void k(File file) {
        String canonicalPath;
        if (file == null) {
            this.E = Environment.getExternalStorageDirectory();
        } else if (!file.isDirectory()) {
            return;
        } else {
            this.E = file;
        }
        ArrayList arrayListH = h(this.E.listFiles(), true, false);
        this.B = arrayListH;
        String[] strArrI = i(arrayListH);
        if (strArrI.length < 1) {
            strArrI = new String[]{getResources().getString(JD0.X0)};
        }
        this.C.clear();
        this.C.addAll(strArrI);
        this.C.notifyDataSetChanged();
        try {
            canonicalPath = this.E.getCanonicalPath();
        } catch (IOException unused) {
            canonicalPath = "";
        }
        if (canonicalPath.length() == 0) {
            canonicalPath = "/";
        }
        this.D.setText(canonicalPath);
    }

    public final void l(String str) {
        k((str == null || str.isEmpty()) ? null : new File(str));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i2 = arguments.getInt("arg1");
        String string = arguments.getString("arg2");
        String string2 = arguments.getString("arg3");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(i2);
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.b, null);
        builder.setView(viewInflate);
        View[] viewArr = {viewInflate.findViewById(AbstractC5056hD0.a1), viewInflate.findViewById(AbstractC5056hD0.b1), viewInflate.findViewById(AbstractC5056hD0.e1), viewInflate.findViewById(AbstractC5056hD0.c1), viewInflate.findViewById(AbstractC5056hD0.d1)};
        viewArr[4].setVisibility(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().v() ? 0 : 8);
        viewArr[0].setOnClickListener(new a());
        viewArr[1].setOnClickListener(new b());
        viewArr[2].setOnClickListener(new c());
        viewArr[3].setOnClickListener(new d());
        viewArr[4].setOnClickListener(new e());
        this.D = (EditText) viewInflate.findViewById(AbstractC5056hD0.V3);
        ((Button) viewInflate.findViewById(AbstractC5056hD0.L)).setOnClickListener(new f());
        ListView listView = (ListView) viewInflate.findViewById(AbstractC5056hD0.V1);
        listView.setTextFilterEnabled(true);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), AbstractC9815yD0.c);
        this.C = arrayAdapter;
        listView.setAdapter((ListAdapter) arrayAdapter);
        l(string);
        listView.setOnItemClickListener(new g());
        builder.setPositiveButton(JD0.U0, new h(string2));
        builder.setNegativeButton(JD0.S0, new i());
        return builder.create();
    }
}
