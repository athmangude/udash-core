/** Based on <a href="https://github.com/Karasiq/scalajs-highcharts">Karasiq wrapper</a>. */
package io.udash.wrappers.highcharts
package config
package series.arearange

import io.udash.wrappers.highcharts.config.series._
import io.udash.wrappers.highcharts.config.utils._

import scala.scalajs.js
import scala.scalajs.js.`|`

@js.annotation.ScalaJSDefined
class SeriesArearange extends AreaLineSeries {
  override type Data = js.Array[SeriesArearangeData | js.Array[String | Double]]
  override type DataLabels = SeriesRangeDataLabels
  override type States = SeriesAreaStates
  override val `type`: String = "arearange"

  /**
    * Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code> and <code>right</code>.
    *
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/line-step/" target="_blank">Different step line options</a>
    */
  val step: js.UndefOr[String] = js.undefined
}

object SeriesArearange {
  import scala.scalajs.js.JSConverters._

  /**
    * @param allowPointSelect    Allow this series' points to be selected by clicking on the markers, bars or pie slices.
    * @param animation           <p>Enable or disable the initial animation when a series is displayed. The animation can also be set as a configuration object. Please note that this option only applies to the initial animation of the series itself. For other animations, see <a href="#chart.animation">chart.animation</a> and the animation parameter under the API methods.		The following properties are supported:</p>. <dl>.   <dt>duration</dt>.   <dd>The duration of the animation in milliseconds.</dd>. <dt>easing</dt>. <dd>A string reference to an easing function set on the <code>Math</code> object. See <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/">the easing demo</a>.</dd>. </dl>. <p>. Due to poor performance, animation is disabled in old IE browsers for column charts and polar charts.</p>
    * @param animationLimit      For some series, there is a limit that shuts down initial animation by default when the total number of points in the chart is too high. For example, for a column chart and its derivatives, animation doesn't run if there is more than 250 points totally. To disable this cap, set <code>animationLimit</code> to <code>Infinity</code>.
    * @param className           A class name to apply to the series' graphical elements.
    * @param color               The main color or the series. In line type series it applies to the line and the point markers unless otherwise specified. In bar type series it applies to the bars unless a color is specified per point. The default value is pulled from the  <code>options.colors</code> array.
    * @param connectNulls        Whether to connect a graph line across null points.
    * @param cropThreshold       When the series contains less points than the crop threshold, all points are drawn,  even if the points fall outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and columns), is that animation is performed on updates. On the other hand, when the series contains more points than the crop threshold, the series data is cropped to only contain points that fall within the plot area. The advantage of cropping away invisible points is to increase performance on large series.
    * @param cursor              You can set the cursor to "pointer" if you have click events attached to  the series, to signal to the user that the points and lines can be clicked.
    * @param dashStyle           A name for the dash style to use for the graph. Applies only to series type having a graph, like <code>line</code>, <code>spline</code>, <code>area</code> and <code>scatter</code> in  case it has a <code>lineWidth</code>. The value for the <code>dashStyle</code> include:. 		    <ul>. 		    	<li>Solid</li>. 		    	<li>ShortDash</li>. 		    	<li>ShortDot</li>. 		    	<li>ShortDashDot</li>. 		    	<li>ShortDashDotDot</li>. 		    	<li>Dot</li>. 		    	<li>Dash</li>. 		    	<li>LongDash</li>. 		    	<li>DashDot</li>. 		    	<li>LongDashDot</li>. 		    	<li>LongDashDotDot</li>. 		    </ul>
    * @param data                An array of data points for the series. For the <code>arearange</code> series type, points can be given in the following ways:.  <ol>.  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is.  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> .  	and <code>pointInterval</code> given in the series options.</p>. <pre>data: [.     [0, 8, 3], .     [1, 1, 1], .     [2, 6, 8]. ]</pre></li>. . . <li><p>An array of objects with named values. The objects are.  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<arearange>.turboThreshold'>turboThreshold</a>, this option is not available.</p>. . <pre>data: [{.     x: 1,.     low: 9,.     high: 0,.     name: "Point2",.     color: "#00FF00". }, {.     x: 1,.     low: 3,.     high: 4,.     name: "Point1",.     color: "#FF00FF". }]</pre></li>.  </ol>
    * @param dataLabels          Extended data labels for range series types. Range series  data labels have no <code>x</code> and <code>y</code> options. Instead, they have <code>xLow</code>, <code>xHigh</code>, <code>yLow</code> and <code>yHigh</code> options to allow the higher and lower data label sets individually.
    * @param enableMouseTracking Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on graphs and points. For large datasets it improves performance.
    * @param fillColor           Fill color or gradient for the area. When <code>null</code>, the series' <code>color</code>  is  used with the series' <code>fillOpacity</code>.
    * @param fillOpacity         Fill opacity for the area. Note that when you set an explicit <code>fillColor</code>, the <code>fillOpacity</code> is not applied. Instead, you should define the opacity in the <code>fillColor</code> with an rgba color definition.
    * @param getExtremesFromAll  Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
    * @param id                  An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index               The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param keys                An array specifying which option maps to which key in the data point array. This makes it convenient to work with unstructured data arrays from different sources.
    * @param legendIndex         The sequential index of the series in the legend.  <div class="demo">Try it:  	<a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/series/legendindex/" target="_blank">Legend in opposite order</a> </div>.
    * @param lineColor           A separate color for the graph line. By default the line takes the <code>color</code> of the series, but the lineColor setting allows setting a separate color for the line without altering the <code>fillColor</code>.
    * @param lineWidth           Pixel width of the arearange graph line.
    * @param linecap             The line cap used for line ends and line joins on the graph.
    * @param linkedTo            The <a href="#series.id">id</a> of another series to link to. Additionally, the value can be ":previous" to link to the previous series. When two series are linked, only the first one appears in the legend. Toggling the visibility of this also toggles the linked series.
    * @param name                The name of the series as shown in the legend, tooltip etc.
    * @param negativeColor       The color for the parts of the graph or points that are below the <a href="#plotOptions.series.threshold">threshold</a>.
    * @param negativeFillColor   A separate color for the negative part of the area.
    * @param point               Properties for each single point
    * @param pointInterval       <p>If no x values are given for the points in a series, pointInterval defines.  the interval of the x values. For example, if a series contains one value.  every decade starting from year 0, set pointInterval to 10.</p>. <p>Since Highcharts 4.1, it can be combined with <code>pointIntervalUnit</code> to draw irregular intervals.</p>
    * @param pointIntervalUnit   On datetime series, this allows for setting the <a href="plotOptions.series.pointInterval">pointInterval</a> to irregular time units, <code>day</code>, <code>month</code> and <code>year</code>. A day is usually the same as 24 hours, but pointIntervalUnit also takes the DST crossover into consideration when dealing with local time. Combine this option with <code>pointInterval</code> to draw weeks, quarters, 6 months, 10 years etc.
    * @param pointPlacement      <p>Possible values: <code>null</code>, <code>"on"</code>, <code>"between"</code>.</p>. <p>In a column chart, when pointPlacement is <code>"on"</code>, the point will not create any padding of the X axis. In a polar column chart this means that the first column points directly north. If the pointPlacement is <code>"between"</code>, the columns will be laid out between ticks. This is useful for example for visualising an amount between two points in time or in a certain sector of a polar chart.</p>. <p>Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric point placement options won't affect axis padding.</p>. <p>Note that pointPlacement needs a <a href="#plotOptions.series.pointRange">pointRange</a> to work. For column series this is computed, but for line-type series it needs to be set.</p>. <p>Defaults to <code>null</code> in cartesian charts, <code>"between"</code> in polar charts.
    * @param pointStart          If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a series contains one yearly value starting from 1945, set pointStart to 1945.
    * @param selected            Whether to select the series initially. If <code>showCheckbox</code> is true, the checkbox next to the series name will be checked for a selected series.
    * @param shadow              Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing <code>color</code>, <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
    * @param showCheckbox        If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox is determined by the <code>selected</code> option.
    * @param showInLegend        Whether to display this particular series or series type in the legend. The default value is <code>true</code> for standalone series, <code>false</code> for linked series.
    * @param states              A wrapper object for all the series options in specific states.
    * @param step                Whether to apply steps to the line. Possible values are <code>left</code>, <code>center</code> and <code>right</code>. Prior to 2.3.5, only <code>left</code> was supported.
    * @param stickyTracking      Sticky tracking of mouse events. When true, the <code>mouseOut</code> event.  on a series isn't triggered until the mouse moves over another series, or out.  of the plot area. When false, the <code>mouseOut</code> event on a series is.  triggered when the mouse leaves the area around the series' graph or markers..  This also implies the tooltip. When <code>stickyTracking</code> is false and <code>tooltip.shared</code> is false, the .  tooltip will be hidden when moving the mouse between series. Defaults to true for line and area type series, but to false for columns, pies etc.
    * @param tooltip             A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
    * @param trackByArea         Whether the whole area or just the line should respond to mouseover tooltips and other mouse or touch events.
    * @param turboThreshold      When a series contains a data array that is longer than this, only one dimensional arrays of numbers,.  or two dimensional arrays with x and y values are allowed. Also, only the first.  point is tested, and the rest are assumed to be the same format. This saves expensive.  data checking and indexing in long series. Set it to <code>0</code> disable.
    * @param visible             Set the initial visibility of the series.
    * @param xAxis               When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It refers to either the <a href="#xAxis.id">axis id</a> or the index of the axis in the xAxis array, with 0 being the first.
    * @param yAxis               When using dual or multiple y axes, this number defines which yAxis the particular series is connected to. It refers to either the <a href="#yAxis.id">axis id</a> or the index of the axis in the yAxis array, with 0 being the first.
    * @param zIndex              Define the visual z index of the series.
    * @param zoneAxis            Defines the Axis on which the zones are applied.
    * @param zones               An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles, according to the <code>zoneAxis</code> option.
    */
  def apply(allowPointSelect: js.UndefOr[Boolean] = js.undefined,
            animation: js.UndefOr[Animation] = js.undefined,
            animationLimit: js.UndefOr[Double] = js.undefined,
            className: js.UndefOr[String] = js.undefined,
            color: js.UndefOr[Color] = js.undefined,
            connectEnds: js.UndefOr[Boolean] = js.undefined,
            connectNulls: js.UndefOr[Boolean] = js.undefined,
            cropThreshold: js.UndefOr[Double] = js.undefined,
            cursor: js.UndefOr[String] = js.undefined,
            dashStyle: js.UndefOr[DashStyle] = js.undefined,
            data: Seq[SeriesArearangeData] = Seq.empty,
            dataLabels: js.UndefOr[SeriesRangeDataLabels] = js.undefined,
            description: js.UndefOr[String] = js.undefined,
            enableMouseTracking: js.UndefOr[Boolean] = js.undefined,
            events: js.UndefOr[SeriesEvents] = js.undefined,
            fillColor: js.UndefOr[Color] = js.undefined,
            fillOpacity: js.UndefOr[Double] = js.undefined,
            getExtremesFromAll: js.UndefOr[Boolean] = js.undefined,
            id: js.UndefOr[String] = js.undefined,
            index: js.UndefOr[Double] = js.undefined,
            keys: js.UndefOr[Seq[String]] = js.undefined,
            legendIndex: js.UndefOr[Double] = js.undefined,
            lineColor: js.UndefOr[Color] = js.undefined,
            lineWidth: js.UndefOr[Double] = js.undefined,
            linecap: js.UndefOr[String] = js.undefined,
            linkedTo: js.UndefOr[String] = js.undefined,
            name: js.UndefOr[String] = js.undefined,
            negativeColor: js.UndefOr[Color] = js.undefined,
            negativeFillColor: js.UndefOr[Color] = js.undefined,
            point: js.UndefOr[SeriesPoint] = js.undefined,
            pointInterval: js.UndefOr[Double] = js.undefined,
            pointIntervalUnit: js.UndefOr[PointIntervalUnit] = js.undefined,
            pointPlacement: js.UndefOr[PointPlacement] = js.undefined,
            pointStart: js.UndefOr[Double] = js.undefined,
            selected: js.UndefOr[Boolean] = js.undefined,
            shadow: js.UndefOr[Shadow] = js.undefined,
            showCheckbox: js.UndefOr[Boolean] = js.undefined,
            showInLegend: js.UndefOr[Boolean] = js.undefined,
            softThreshold: js.UndefOr[Boolean] = js.undefined,
            states: js.UndefOr[SeriesAreaStates] = js.undefined,
            step: js.UndefOr[Step] = js.undefined,
            stickyTracking: js.UndefOr[Boolean] = js.undefined,
            tooltip: js.UndefOr[SeriesTooltip] = js.undefined,
            trackByArea: js.UndefOr[Boolean] = js.undefined,
            turboThreshold: js.UndefOr[Double] = js.undefined,
            visible: js.UndefOr[Boolean] = js.undefined,
            xAxis: js.UndefOr[Int | String] = js.undefined,
            yAxis: js.UndefOr[Int | String] = js.undefined,
            zIndex: js.UndefOr[Int] = js.undefined,
            zoneAxis: js.UndefOr[String] = js.undefined,
            zones: js.UndefOr[Seq[SeriesZone]] = js.undefined): SeriesArearange = {
    val allowPointSelectOuter = allowPointSelect
    val animationOuter = animation.map(_.value)
    val animationLimitOuter = animationLimit
    val classNameOuter = className
    val colorOuter = color.map(_.c)
    val connectEndsOuter = connectEnds
    val connectNullsOuter = connectNulls
    val cropThresholdOuter = cropThreshold
    val cursorOuter = cursor
    val dashStyleOuter = dashStyle.map(_.name)
    val dataOuter = data.toJSArray.asInstanceOf[js.UndefOr[SeriesArearange#Data]]
    val dataLabelsOuter = dataLabels
    val descriptionOuter = description
    val enableMouseTrackingOuter = enableMouseTracking
    val eventsOuter = events
    val fillColorOuter = fillColor.map(_.c)
    val fillOpacityOuter = fillOpacity
    val getExtremesFromAllOuter = getExtremesFromAll
    val idOuter = id
    val indexOuter = index
    val keysOuter = keys.map(_.toJSArray)
    val legendIndexOuter = legendIndex
    val lineColorOuter = lineColor.map(_.c)
    val lineWidthOuter = lineWidth
    val linecapOuter = linecap
    val linkedToOuter = linkedTo
    val nameOuter = name
    val negativeColorOuter = negativeColor.map(_.c)
    val negativeFillColorOuter = negativeFillColor.map(_.c)
    val pointOuter = point
    val pointIntervalOuter = pointInterval
    val pointIntervalUnitOuter = pointIntervalUnit.map(_.name)
    val pointPlacementOuter = pointPlacement.map(_.name)
    val pointStartOuter = pointStart
    val selectedOuter = selected
    val shadowOuter = shadow.map(_.value)
    val showCheckboxOuter = showCheckbox
    val showInLegendOuter = showInLegend
    val softThresholdOuter = softThreshold
    val statesOuter = states
    val stepOuter = step.map(_.name)
    val stickyTrackingOuter = stickyTracking
    val tooltipOuter = tooltip
    val trackByAreaOuter = trackByArea
    val turboThresholdOuter = turboThreshold
    val visibleOuter = visible
    val xAxisOuter = xAxis
    val yAxisOuter = yAxis
    val zIndexOuter = zIndex
    val zoneAxisOuter = zoneAxis
    val zonesOuter = zones.map(_.toJSArray)

    new SeriesArearange {
      override val allowPointSelect = allowPointSelectOuter
      override val animation = animationOuter
      override val animationLimit = animationLimitOuter
      override val className = classNameOuter
      override val color = colorOuter
      override val connectEnds = connectEndsOuter
      override val connectNulls = connectNullsOuter
      override val cropThreshold = cropThresholdOuter
      override val cursor = cursorOuter
      override val dashStyle = dashStyleOuter
      override val data = dataOuter
      override val dataLabels = dataLabelsOuter
      override val description = descriptionOuter
      override val enableMouseTracking = enableMouseTrackingOuter
      override val events = eventsOuter
      override val fillColor = fillColorOuter
      override val fillOpacity = fillOpacityOuter
      override val getExtremesFromAll = getExtremesFromAllOuter
      override val id = idOuter
      override val index = indexOuter
      override val keys = keysOuter
      override val legendIndex = legendIndexOuter
      override val lineColor = lineColorOuter
      override val lineWidth = lineWidthOuter
      override val linecap = linecapOuter
      override val linkedTo = linkedToOuter
      override val name = nameOuter
      override val negativeColor = negativeColorOuter
      override val negativeFillColor = negativeFillColorOuter
      override val point = pointOuter
      override val pointInterval = pointIntervalOuter
      override val pointIntervalUnit = pointIntervalUnitOuter
      override val pointPlacement = pointPlacementOuter
      override val pointStart = pointStartOuter
      override val selected = selectedOuter
      override val shadow = shadowOuter
      override val showCheckbox = showCheckboxOuter
      override val showInLegend = showInLegendOuter
      override val softThreshold = softThresholdOuter
      override val states = statesOuter
      override val step = stepOuter
      override val stickyTracking = stickyTrackingOuter
      override val tooltip = tooltipOuter
      override val trackByArea = trackByAreaOuter
      override val turboThreshold = turboThresholdOuter
      override val visible = visibleOuter
      override val xAxis = xAxisOuter
      override val yAxis = yAxisOuter
      override val zIndex = zIndexOuter
      override val zoneAxis = zoneAxisOuter
      override val zones = zonesOuter
    }
  }
}
