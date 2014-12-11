package models.apidocs

import com.wordnik.swagger.annotations.ApiModelProperty
import org.joda.time.DateTime

import scala.annotation.meta.field

case class ComponentWithRelations
(@(ApiModelProperty @field)(required = true) createdAt: DateTime,
 @(ApiModelProperty @field)(required = false) description: Option[String],
 @(ApiModelProperty @field)(required = true) id: Long,
 @(ApiModelProperty @field)(required = true) name: String,
 @(ApiModelProperty @field)(required = true) neededQuantity: Int,
 @(ApiModelProperty @field)(required = true) productId: Long,
 @(ApiModelProperty @field)(required = true) unclassifiedQuantity: Int,
 @(ApiModelProperty @field)(required = true) updatedAt: DateTime,
 @(ApiModelProperty @field)(required = true) inventories: Seq[ComponentInventory],
 @(ApiModelProperty @field)(required = true) orders: Seq[Order])
