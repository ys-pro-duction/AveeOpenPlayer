package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Lh3 {
    public static String a(AbstractC9646xd3 abstractC9646xd3) {
        StringBuilder sb = new StringBuilder(abstractC9646xd3.s());
        for (int i = 0; i < abstractC9646xd3.s(); i++) {
            byte bE = abstractC9646xd3.e(i);
            if (bE == 34) {
                sb.append("\\\"");
            } else if (bE == 39) {
                sb.append("\\'");
            } else if (bE != 92) {
                switch (bE) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bE < 32 || bE > 126) {
                            sb.append('\\');
                            sb.append((char) (((bE >>> 6) & 3) + 48));
                            sb.append((char) (((bE >>> 3) & 7) + 48));
                            sb.append((char) ((bE & 7) + 48));
                        } else {
                            sb.append((char) bE);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
