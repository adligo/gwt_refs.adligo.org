package org.adligo.gwt_refs;

import org.adligo.gwt_refs.v2_6.GWT_2_6_Annot;
import org.adligo.gwt_refs.v2_6.GWT_2_6_IO;
import org.adligo.gwt_refs.v2_6.GWT_2_6_Lang;
import org.adligo.gwt_refs.v2_6.GWT_2_6_Log;
import org.adligo.gwt_refs.v2_6.GWT_2_6_Math;
import org.adligo.gwt_refs.v2_6.GWT_2_6_SQL;
import org.adligo.gwt_refs.v2_6.GWT_2_6_Util;
import org.adligo.tests4j.shared.asserts.reference.ReferenceGroup;
import org.adligo.tests4j.shared.asserts.reference.ReferenceGroupBaseDelegate;
import org.adligo.tests4j.shared.asserts.reference.ReferenceGroupMutant;


/**
 * these are constants for the most current
 * version of GWT.
 * The plan is to support at least the 
 * previous 3 minor versions (today on 8/26/2014 that would be 2.4, 2.5, 2.6)
 * Although since GWT has been generally backward compatible,
 * this will be the first for 2.6, 2.7, 2.8 exc.
 * 
 * use;
 * add
 * @AllowedDependencies (groups=GWT_DependencyGroup.class)
 * @author scott
 *
 */
public class GWT_ReferenceGroup extends ReferenceGroupBaseDelegate {
	public static final GWT_ReferenceGroup INSTANCE = new GWT_ReferenceGroup();
	
	private GWT_ReferenceGroup() {
		ReferenceGroupMutant dgm = new ReferenceGroupMutant();
		dgm.addClassMethods(GWT_2_6_Lang.getAppendable());
		dgm.addClassMethods(GWT_2_6_Lang.getArithmeticException());
		dgm.addClassMethods(GWT_2_6_Lang.getArrayIndexOutOfBoundsException());
		dgm.addClassMethods(GWT_2_6_Lang.getArrayStoreException());
		dgm.addClassMethods(GWT_2_6_Lang.getAssertionError());
		dgm.addClassMethods(GWT_2_6_Lang.getAutoCloseable());
		
		dgm.addClassMethods(GWT_2_6_Lang.getBoolean());
		dgm.addClassMethods(GWT_2_6_Lang.getByte());
		
		dgm.addClassMethods(GWT_2_6_Lang.getCharSequence());
		dgm.addClassMethods(GWT_2_6_Lang.getCharacter());
		dgm.addClassMethods(GWT_2_6_Lang.getClassAttributeMembers());
		dgm.addClassMethods(GWT_2_6_Lang.getClassCastException());
		dgm.addClassMethods(GWT_2_6_Lang.getCloneable());
		dgm.addClassMethods(GWT_2_6_Lang.getComparable());
		
		dgm.addClassMethods(GWT_2_6_Lang.getDeprecated());
		dgm.addClassMethods(GWT_2_6_Lang.getDouble());
		
		dgm.addClassMethods(GWT_2_6_Lang.getEnum());
		dgm.addClassMethods(GWT_2_6_Lang.getError());
		dgm.addClassMethods(GWT_2_6_Lang.getException());
		
		dgm.addClassMethods(GWT_2_6_Lang.getFloat());
		
		dgm.addClassMethods(GWT_2_6_Lang.getIllegalArgumentException());
		dgm.addClassMethods(GWT_2_6_Lang.getIllegalStateException());
		dgm.addClassMethods(GWT_2_6_Lang.getIndexOutOfBoundsException());
		dgm.addClassMethods(GWT_2_6_Lang.getIncompatibleClassChangeError());
		dgm.addClassMethods(GWT_2_6_Lang.getInteger());
		dgm.addClassMethods(GWT_2_6_Lang.getIterable());
		
		dgm.addClassMethods(GWT_2_6_Lang.getLinkageError());
		dgm.addClassMethods(GWT_2_6_Lang.getLong());
		
		dgm.addClassMethods(GWT_2_6_Lang.getMath());
		
		dgm.addClassMethods(GWT_2_6_Lang.getNegativeArraySizeException());
		dgm.addClassMethods(GWT_2_6_Lang.getNoSuchFieldError());
		dgm.addClassMethods(GWT_2_6_Lang.getNoSuchMethodException());
		dgm.addClassMethods(GWT_2_6_Lang.getNullPointerException());
		dgm.addClassMethods(GWT_2_6_Lang.getNumber());
		dgm.addClassMethods(GWT_2_6_Lang.getNumberFormatException());
		
		dgm.addClassMethods(GWT_2_6_Lang.getObject());
		dgm.addClassMethods(GWT_2_6_Lang.getOverride());
		
		dgm.addClassMethods(GWT_2_6_Lang.getRunnable());
		dgm.addClassMethods(GWT_2_6_Lang.getRuntimeException());
		
		dgm.addClassMethods(GWT_2_6_Lang.getShort());
		dgm.addClassMethods(GWT_2_6_Lang.getStackTraceElement());
		dgm.addClassMethods(GWT_2_6_Lang.getString());
		dgm.addClassMethods(GWT_2_6_Lang.getStringBuffer());
		dgm.addClassMethods(GWT_2_6_Lang.getStringBuilder());
		dgm.addClassMethods(GWT_2_6_Lang.getStringIndexOutOfBoundsException());
		dgm.addClassMethods(GWT_2_6_Lang.getSuppressWarnings());
		dgm.addClassMethods(GWT_2_6_Lang.getSystem());
		
		dgm.addClassMethods(GWT_2_6_Lang.getThrowable());
		dgm.addClassMethods(GWT_2_6_Lang.getUnsupportedOperationException());
		dgm.addClassMethods(GWT_2_6_Lang.getVoid());
		
		//annotations
		dgm.addClassMethods(GWT_2_6_Annot.getAnnotation());
		dgm.addClassMethods(GWT_2_6_Annot.getAnnotationFormatError());
		dgm.addClassMethods(GWT_2_6_Annot.getAnnotationTypeMismatchException());
		
		dgm.addClassMethods(GWT_2_6_Annot.getDocumented());
		
		dgm.addClassMethods(GWT_2_6_Annot.getElementType());
		
		dgm.addClassMethods(GWT_2_6_Annot.getIncompleteAnnotationException());
		dgm.addClassMethods(GWT_2_6_Annot.getInherited());
		
		dgm.addClassMethods(GWT_2_6_Annot.getRetention());
		dgm.addClassMethods(GWT_2_6_Annot.getRetentionPolicy());
		dgm.addClassMethods(GWT_2_6_Annot.getTarget());
		
		dgm.addClassMethods(GWT_2_6_Annot.getTarget());
		
		dgm.addClassMethods(GWT_2_6_Math.getBigDecimal());
		dgm.addClassMethods(GWT_2_6_Math.getBigInteger());
		dgm.addClassMethods(GWT_2_6_Math.getMathContext());
		dgm.addClassMethods(GWT_2_6_Math.getRoundingMode());
		
		dgm.addClassMethods(GWT_2_6_IO.getFilterOutputStream());
		dgm.addClassMethods(GWT_2_6_IO.getIOException());
		dgm.addClassMethods(GWT_2_6_IO.getOutputStream());
		dgm.addClassMethods(GWT_2_6_IO.getPrintStream());
		dgm.addClassMethods(GWT_2_6_IO.getSerializable());
		dgm.addClassMethods(GWT_2_6_IO.getUnsupportedEncodingException());
	
		dgm.addClassMethods(GWT_2_6_SQL.getDate());
		dgm.addClassMethods(GWT_2_6_SQL.getTime());
		dgm.addClassMethods(GWT_2_6_SQL.getTimestamp());
		
		//util
		dgm.addClassMethods(GWT_2_6_Util.getAbstractCollection());
		dgm.addClassMethods(GWT_2_6_Util.getAbstractList());
		dgm.addClassMethods(GWT_2_6_Util.getAbstractMap());
		dgm.addClassMethods(GWT_2_6_Util.getAbstractQueue());
		dgm.addClassMethods(GWT_2_6_Util.getAbstractSequentialList());
		dgm.addClassMethods(GWT_2_6_Util.getAbstractSet());
		dgm.addClassMethods(GWT_2_6_Util.getArrayList());
		dgm.addClassMethods(GWT_2_6_Util.getArrays());
		
		dgm.addClassMethods(GWT_2_6_Util.getCollection());
		dgm.addClassMethods(GWT_2_6_Util.getCollections());
		dgm.addClassMethods(GWT_2_6_Util.getComparator());
		dgm.addClassMethods(GWT_2_6_Util.getConcurrentModificationException());
	
		dgm.addClassMethods(GWT_2_6_Util.getDate());
		
		dgm.addClassMethods(GWT_2_6_Util.getEmptyStackException());
		dgm.addClassMethods(GWT_2_6_Util.getEnumMap());
		dgm.addClassMethods(GWT_2_6_Util.getEnumSet());
		dgm.addClassMethods(GWT_2_6_Util.getEnumeration());
		dgm.addClassMethods(GWT_2_6_Util.getEventListener());
		dgm.addClassMethods(GWT_2_6_Util.getEventObject());
		
		dgm.addClassMethods(GWT_2_6_Util.getHashMap());
		dgm.addClassMethods(GWT_2_6_Util.getHashSet());
		dgm.addClassMethods(GWT_2_6_Util.getIdentityHashMap());
		
		dgm.addClassMethods(GWT_2_6_Util.getIterator());
		dgm.addClassMethods(GWT_2_6_Util.getLinkedHashMap());
		dgm.addClassMethods(GWT_2_6_Util.getLinkedHashSet());
		dgm.addClassMethods(GWT_2_6_Util.getLinkedList());
		dgm.addClassMethods(GWT_2_6_Util.getList());
		dgm.addClassMethods(GWT_2_6_Util.getListIterator());
		
		dgm.addClassMethods(GWT_2_6_Util.getMap());
		dgm.addClassMethods(GWT_2_6_Util.getMapEntry());
		dgm.addClassMethods(GWT_2_6_Util.getMissingResourceException());
		
		dgm.addClassMethods(GWT_2_6_Util.getNoSuchElementException());
		
		dgm.addClassMethods(GWT_2_6_Util.getObjects());
		
		dgm.addClassMethods(GWT_2_6_Util.getPriorityQueue());
		
		dgm.addClassMethods(GWT_2_6_Util.getQueue());
		
		dgm.addClassMethods(GWT_2_6_Util.getRandom());
		dgm.addClassMethods(GWT_2_6_Util.getRandomAccess());
		
		dgm.addClassMethods(GWT_2_6_Util.getSet());
		dgm.addClassMethods(GWT_2_6_Util.getSortedMap());
		dgm.addClassMethods(GWT_2_6_Util.getSortedSet());
		dgm.addClassMethods(GWT_2_6_Util.getStack());
		
		dgm.addClassMethods(GWT_2_6_Util.getTooManyListenersException());
		dgm.addClassMethods(GWT_2_6_Util.getTreeMap());
		dgm.addClassMethods(GWT_2_6_Util.getTreeSet());
		
		dgm.addClassMethods(GWT_2_6_Util.getVector());
		
		dgm.addClassMethods(GWT_2_6_Log.getFormatter());
		dgm.addClassMethods(GWT_2_6_Log.getHandler());
		dgm.addClassMethods(GWT_2_6_Log.getLevel());
		dgm.addClassMethods(GWT_2_6_Log.getLogManager());
		dgm.addClassMethods(GWT_2_6_Log.getLogRecord());
		dgm.addClassMethods(GWT_2_6_Log.getLogger());
		super.setDelegate(new ReferenceGroup(dgm));
	}
}
