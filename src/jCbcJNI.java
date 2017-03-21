/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package src;

public class jCbcJNI {
  public final static native long new_jarray_double(int jarg1);
  public final static native void delete_jarray_double(long jarg1);
  public final static native double jarray_double_getitem(long jarg1, int jarg2);
  public final static native void jarray_double_setitem(long jarg1, int jarg2, double jarg3);
  public final static native long new_jarray_int(int jarg1);
  public final static native void delete_jarray_int(long jarg1);
  public final static native int jarray_int_getitem(long jarg1, int jarg2);
  public final static native void jarray_int_setitem(long jarg1, int jarg2, int jarg3);
  public final static native long new_jarray_string(int jarg1);
  public final static native void delete_jarray_string(long jarg1);
  public final static native String jarray_string_getitem(long jarg1, int jarg2);
  public final static native void jarray_string_setitem(long jarg1, int jarg2, String jarg3);
  public final static native long new_jCbcModel();
  public final static native long copy_jCbcModel(long jarg1);
  public final static native void delete_jCbcModel(long jarg1);
  public final static native void jCbcModel_assign(long jarg1, long jarg2);
  public final static native long jCbcModel_value(long jarg1);
  public final static native long new_jCoinModel();
  public final static native long copy_jCoinModel(long jarg1);
  public final static native void delete_jCoinModel(long jarg1);
  public final static native void jCoinModel_assign(long jarg1, long jarg2);
  public final static native long jCoinModel_value(long jarg1);
  public final static native long new_jOsiClpSolverInterface();
  public final static native long copy_jOsiClpSolverInterface(long jarg1);
  public final static native void delete_jOsiClpSolverInterface(long jarg1);
  public final static native void jOsiClpSolverInterface_assign(long jarg1, long jarg2);
  public final static native long jOsiClpSolverInterface_value(long jarg1);
  public final static native long new_jCoinPackedMatrix();
  public final static native long copy_jCoinPackedMatrix(long jarg1);
  public final static native void delete_jCoinPackedMatrix(long jarg1);
  public final static native void jCoinPackedMatrix_assign(long jarg1, long jarg2);
  public final static native long jCoinPackedMatrix_value(long jarg1);
  public final static native void addCol(long jarg1, double jarg2, double jarg3, double jarg4, String jarg5, boolean jarg6);
  public final static native void addRows__SWIG_0(long jarg1, long jarg2);
  public final static native void addRow(long jarg1, int jarg2, long jarg3, long jarg4, double jarg5, double jarg6, String jarg7);
  public final static native void branchAndBound(long jarg1);
  public final static native void readMps__SWIG_0(long jarg1, String jarg2);
  public final static native void readLp__SWIG_0(long jarg1, String jarg2);
  public final static native void writeMps__SWIG_0(long jarg1, String jarg2);
  public final static native void writeLp__SWIG_0(long jarg1, String jarg2);
  public final static native long getSol(long jarg1);
  public final static native void setInteger__SWIG_0(long jarg1, int jarg2);
  public final static native void addRows__SWIG_1(long jarg1, long jarg2);
  public final static native void assignSolver(long jarg1, long jarg2);
  public final static native void readMps__SWIG_1(long jarg1, String jarg2);
  public final static native void readLp__SWIG_1(long jarg1, String jarg2);
  public final static native void setInteger__SWIG_1(long jarg1, int jarg2);
  public final static native void initialSolve(long jarg1);
  public final static native void setLogLevel__SWIG_0(long jarg1, int jarg2);
  public final static native void setLogLevel__SWIG_1(long jarg1, int jarg2);
  public final static native void writeMps__SWIG_1(long jarg1, String jarg2);
  public final static native void writeLp__SWIG_1(long jarg1, String jarg2);
  public final static native void solve__SWIG_0(long jarg1, long jarg2, int jarg3);
  public final static native void solve__SWIG_1(long jarg1, long jarg2);
  public final static native void solve_1__SWIG_0(long jarg1, long jarg2, int jarg3);
  public final static native void solve_1__SWIG_1(long jarg1, long jarg2);
  public final static native int solve_2__SWIG_0(long jarg1, long jarg2, int jarg3);
  public final static native int solve_2__SWIG_1(long jarg1, long jarg2);
  public final static native int solve_3__SWIG_0(long jarg1, long jarg2, int jarg3, double jarg4);
  public final static native int solve_3__SWIG_1(long jarg1, long jarg2, int jarg3);
  public final static native int solve_3__SWIG_2(long jarg1, long jarg2);
  public final static native int isInteger__SWIG_0(long jarg1, int jarg2);
  public final static native int isInteger__SWIG_1(long jarg1, int jarg2);
  public final static native String getRowName__SWIG_0(long jarg1, int jarg2);
  public final static native String getColName__SWIG_0(long jarg1, int jarg2);
  public final static native String getRowName__SWIG_1(long jarg1, int jarg2);
  public final static native String getColName__SWIG_1(long jarg1, int jarg2);
  public final static native int getNumRows__SWIG_0(long jarg1);
  public final static native int getNumCols__SWIG_0(long jarg1);
  public final static native int getNumRows__SWIG_1(long jarg1);
  public final static native int getNumCols__SWIG_1(long jarg1);
  public final static native long getColSolution__SWIG_0(long jarg1);
  public final static native long getRowPrice__SWIG_0(long jarg1);
  public final static native long getRowActivity__SWIG_0(long jarg1);
  public final static native long getReducedCost__SWIG_0(long jarg1);
  public final static native long getColSolution__SWIG_1(long jarg1);
  public final static native long getRowPrice__SWIG_1(long jarg1);
  public final static native long getRowActivity__SWIG_1(long jarg1);
  public final static native long getReducedCost__SWIG_1(long jarg1);
  public final static native int numberIntegers(long jarg1);
  public final static native double getObjValue__SWIG_0(long jarg1);
  public final static native int status(long jarg1);
  public final static native int isProvenOptimal(long jarg1);
  public final static native int isProvenInfeasible(long jarg1);
  public final static native void setModelName(long jarg1, String jarg2);
  public final static native String getModelName(long jarg1);
  public final static native int isBinary(long jarg1, int jarg2);
  public final static native int secondaryStatus(long jarg1);
  public final static native double getCoinCpuTime();
  public final static native double getObjValue__SWIG_1(long jarg1);
  public final static native void setRowName(long jarg1, int jarg2, String jarg3);
  public final static native void setPrimalTolerance(long jarg1, double jarg2);
  public final static native void setDualTolerance(long jarg1, double jarg2);
  public final static native void setIntegerTolerance(long jarg1, double jarg2);
  public final static native int solve_whs__SWIG_0(long jarg1, long jarg2, long jarg3, long jarg4, int jarg5, int jarg6, double jarg7);
  public final static native int solve_whs__SWIG_1(long jarg1, long jarg2, long jarg3, long jarg4, int jarg5, int jarg6);
  public final static native int solve_whs__SWIG_2(long jarg1, long jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int getNumIntegers(long jarg1);
  public final static native void writeLp1__SWIG_0(long jarg1, String jarg2, double jarg3, int jarg4);
  public final static native void writeLp1__SWIG_1(long jarg1, String jarg2, double jarg3);
  public final static native void writeLp1__SWIG_2(long jarg1, String jarg2);
  public final static native void writeMps1__SWIG_0(long jarg1, String jarg2, int jarg3, int jarg4, double jarg5);
  public final static native void writeMps1__SWIG_1(long jarg1, String jarg2, int jarg3, int jarg4);
  public final static native void writeMps1__SWIG_2(long jarg1, String jarg2, int jarg3);
  public final static native void writeMps1__SWIG_3(long jarg1, String jarg2);
  public final static native void callCbc(String jarg1, long jarg2);
  public final static native void setMaximumNodes(long jarg1, int jarg2);
  public final static native void setNumberThreads(long jarg1, int jarg2);
  public final static native void setThreadMode(long jarg1, int jarg2);
  public final static native void par_solve__SWIG_0(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6, long jarg7, long jarg8, int jarg9, long jarg10, long jarg11, int jarg12);
  public final static native void par_solve__SWIG_1(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6, long jarg7, long jarg8, int jarg9, long jarg10, long jarg11);
  public final static native void par_solve__SWIG_2(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6, long jarg7, long jarg8, int jarg9, long jarg10);
  public final static native void par_solve__SWIG_3(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6, long jarg7, long jarg8, int jarg9);
  public final static native void par_solve__SWIG_4(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6, long jarg7, long jarg8);
  public final static native void par_solve__SWIG_5(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6, long jarg7);
  public final static native void par_solve__SWIG_6(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5, int jarg6);
  public final static native void par_solve__SWIG_7(long jarg1, long jarg2, String jarg3, long jarg4, long jarg5);
  public final static native void par_solve__SWIG_8(long jarg1, long jarg2, String jarg3, long jarg4);
  public final static native void par_solve__SWIG_9(long jarg1, long jarg2, String jarg3);
  public final static native void cutoff(long jarg1, int jarg2);
  public final static native int solve_unified__SWIG_0(long jarg1, long jarg2, long jarg3, long jarg4, int jarg5, int jarg6);
  public final static native int solve_unified__SWIG_1(long jarg1, long jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int solve_unified__SWIG_2(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native int solve_unified__SWIG_3(long jarg1, long jarg2, long jarg3);
  public final static native int solve_unified__SWIG_4(long jarg1, long jarg2);
  public final static native double getMinRHS(long jarg1);
  public final static native double getMinCoeff(long jarg1);
  public final static native double getMaxCoeff(long jarg1);
}