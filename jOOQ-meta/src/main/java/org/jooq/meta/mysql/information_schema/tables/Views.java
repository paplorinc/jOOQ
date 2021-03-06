/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Views extends TableImpl<Record> {

    private static final long serialVersionUID = -2007922849;

    /**
     * The reference instance of <code>information_schema.VIEWS</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.VIEWS.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.VIEW_DEFINITION</code>.
     */
    public static final TableField<Record, String> VIEW_DEFINITION = createField(DSL.name("VIEW_DEFINITION"), org.jooq.impl.SQLDataType.CLOB, VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.CHECK_OPTION</code>.
     */
    public static final TableField<Record, String> CHECK_OPTION = createField(DSL.name("CHECK_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(8), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.IS_UPDATABLE</code>.
     */
    public static final TableField<Record, String> IS_UPDATABLE = createField(DSL.name("IS_UPDATABLE"), org.jooq.impl.SQLDataType.VARCHAR(3), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.DEFINER</code>.
     */
    public static final TableField<Record, String> DEFINER = createField(DSL.name("DEFINER"), org.jooq.impl.SQLDataType.VARCHAR(288), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.SECURITY_TYPE</code>.
     */
    public static final TableField<Record, String> SECURITY_TYPE = createField(DSL.name("SECURITY_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(7), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public static final TableField<Record, String> CHARACTER_SET_CLIENT = createField(DSL.name("CHARACTER_SET_CLIENT"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), VIEWS, "");

    /**
     * The column <code>information_schema.VIEWS.COLLATION_CONNECTION</code>.
     */
    public static final TableField<Record, String> COLLATION_CONNECTION = createField(DSL.name("COLLATION_CONNECTION"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), VIEWS, "");

    /**
     * No further instances allowed
     */
    private Views() {
        this(DSL.name("VIEWS"), null);
    }

    private Views(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Views(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Views(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, VIEWS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
