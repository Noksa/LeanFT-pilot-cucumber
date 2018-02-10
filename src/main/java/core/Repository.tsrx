<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>Repository</className>
    <objects>
        <object type="Window" technology="WPF">
            <name>Генератор отчётностей</name>
            <codeName>Window</codeName>
            <description>пв</description>
            <identification>
                <properties>
                    <property name="WindowTitleRegExp" type="string" isRegExp="false">Генератор отчётностей</property>
                    <property name="ObjectName" type="string" isRegExp="false">Генератор отчётностей</property>
                    <property name="FullType" type="string" isRegExp="false">window</property>
                </properties>
            </identification>
            <children>
                <object type="Menu" technology="WPF">
                    <name>Menu</name>
                    <codeName>Menu</codeName>
                    <identification>
                        <properties>
                            <property name="NativeClass" type="string" isRegExp="false">System.Windows.Controls.Menu</property>
                            <property name="ObjectName" type="string" isRegExp="false">Menu</property>
                        </properties>
                    </identification>
                </object>
                <object type="TabStrip" technology="WPF">
                    <name>tabControl</name>
                    <codeName>TabControlTabStrip</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tabControl</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbOrgName</name>
                    <codeName>TbOrgNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbOrgName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbInn</name>
                    <codeName>TbInnEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbInn</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbKpp</name>
                    <codeName>TbKppEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbKpp</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbLastName</name>
                    <codeName>TbLastNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbLastName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbFirstName</name>
                    <codeName>TbFirstNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbFirstName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbMiddleName</name>
                    <codeName>TbMiddleNameEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbMiddleName</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbKorr</name>
                    <codeName>TbKorrEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbKorr</property>
                        </properties>
                    </identification>
                </object>
                <object type="Calendar" technology="WPF">
                    <name>dpDateFile</name>
                    <codeName>DpDateFileCalendar</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">dpDateFile</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbIfns</name>
                    <codeName>TbIfnsEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbIfns</property>
                        </properties>
                    </identification>
                </object>
                <object type="CheckBox" technology="WPF">
                    <name>cbIfns2</name>
                    <codeName>CbIfns2CheckBox</codeName>
                    <identification>
                        <properties>
                            <property name="Text" type="string" isRegExp="false"></property>
                            <property name="ObjectName" type="string" isRegExp="false">cbIfns2</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbIfns2</name>
                    <codeName>TbIfns2EditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbIfns2</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>tbDirectory</name>
                    <codeName>TbDirectoryEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">tbDirectory</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="WPF">
                    <name>Выбрать папку</name>
                    <codeName>Button</codeName>
                    <identification>
                        <properties>
                            <property name="Text" type="string" isRegExp="false">Выбрать папку</property>
                            <property name="ObjectName" type="string" isRegExp="false">btnFNSChooseDirectory</property>
                        </properties>
                    </identification>
                </object>
                <object type="Button" technology="WPF">
                    <name>Сохранить</name>
                    <codeName>Button1</codeName>
                    <identification>
                        <properties>
                            <property name="Text" type="string" isRegExp="false">Сохранить</property>
                            <property name="ObjectName" type="string" isRegExp="false">btnSave</property>
                        </properties>
                    </identification>
                </object>
                <object type="ComboBox" technology="WPF">
                    <name>comboBox</name>
                    <codeName>ComboBox</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">comboBox</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>textBox</name>
                    <codeName>TextBoxEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">textBox</property>
                        </properties>
                    </identification>
                </object>
                <object type="EditField" technology="WPF">
                    <name>SizeOfNds</name>
                    <codeName>SizeOfNdsEditField</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">SizeOfNds</property>
                        </properties>
                    </identification>
                </object>
                <object type="ComboBox" technology="WPF">
                    <name>cbTemplate</name>
                    <codeName>CbTemplateComboBox</codeName>
                    <identification>
                        <properties>
                            <property name="ObjectName" type="string" isRegExp="false">cbTemplate</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
